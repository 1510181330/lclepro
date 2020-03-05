package com.example.lclepro.Config;


import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    //实现拦截器
    //@Bean注解注释在方法上，将返回的实体类交给容器处理，id是方法名
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //设置拦截成功以后，访问的页面
        shiroFilterFactoryBean.setLoginUrl("/");
        //拦截器Map的创建
        Map<String, String> map = new HashMap<String, String>();
        //针对不同的url，使用不同的拦截器，放到map中，即可生效，完成拦截
        //拦截所有请求
        map.put("/*", "authc");
        //放行登陆请求
        map.put("/", "anon");
        //放行登录认证请求
        map.put("/user/login", "anon");
        map.put("/user/getAllCustomers", "perms[user:getAllCustomers]");
        map.put("/user/getAllDefault", "perms[user:getAllDefault]");

        map.put("/test/*", "anon");
        //设置相关的map集合，完成拦截功能的收集
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    //实现web安全管理器的加载
    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("lcleRealm") LcleRealm realm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        return securityManager;

    }

    //实现Realm的加载
    @Bean
    public LcleRealm lcleRealm(){
        return new LcleRealm();
    }

    //要加入注解，指定方法的拦截，则需要加入以下的三个方法，开启注解模式
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * *
     * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * *
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
     * * @return
     */
    @Bean
    @DependsOn({"lifecycleBeanPostProcessor"})
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

}
