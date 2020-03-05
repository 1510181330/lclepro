package com.example.lclepro.Config;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class LcleRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        Subject subject = SecurityUtils.getSubject();
        LcleCustomer customer = (LcleCustomer)subject.getPrincipal();
        System.out.println(customer.getUsername()+"开始执行授权逻辑！");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("user:*");
        info.addStringPermission("freeclass:*");
        info.addStringPermission("record:*");
        return info;
    }

    //执行认证逻辑，执行login()方法以后，会进入到这里，进行用户名密码的比对
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //执行认证逻辑
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //获取密码
        String password = userService.isUser(token.getUsername());
        if(password==null){
            throw new UnknownAccountException();
        }
        else{
            LcleCustomer customer = userService.selectCustomerByName(token.getUsername());
            return new SimpleAuthenticationInfo(customer, password, "");
        }
    }
}
