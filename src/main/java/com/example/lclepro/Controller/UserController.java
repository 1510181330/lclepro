package com.example.lclepro.Controller;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public Msg login(@RequestParam("username") String username, @RequestParam("password") String password){
        //获取到Subject对象
        Subject suject = SecurityUtils.getSubject();
        //将收集到的用户名和密码存储到token中
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //执行登入方法
        try {
            suject.login(token);
            return Msg.success().add("msg", "登录成功");
        }
        catch (UnknownAccountException e){
            //用户名不存在时抛出的异常
            return Msg.fail().add("msg", "用户不存在，请找到合适的介绍人加入组织(๑•̀ㅂ•́)و✧");
        }
        catch (IncorrectCredentialsException e){
            //用户名密码不匹配时抛出的异常
            return Msg.fail().add("msg", "用户名与密码不匹配(￣_,￣ )");
        }
    }

    //使用ajax进行数据交互的方法，需要加上@ResponseBody注解
    @RequiresPermissions("user:getAllCustomers")
    @GetMapping("/getAllCustomers")
    @ResponseBody
    public Msg getAllCustomers(){
        return userService.getAllCustomers();
    }

    @RequiresPermissions("user:getAllDefault")
    @GetMapping("/getAllDefault")
    @ResponseBody
    public Msg getAllDefault(){
        List<LcleCustomer> result = userService.selectByContion();
        if(result != null){
            return Msg.success().add("data", result);
        }
        else{
            return Msg.fail().add("msg", "风太大，把老肖的信号吹跑了");
        }
    }


    @RequiresPermissions("user:updateUserInfo")
    @PostMapping("/updateUserInfo")
    @ResponseBody
    public Msg updateUserInfo(@RequestBody String info) throws ParseException {
        //使用工具类解析json
        JSONObject object = (JSONObject)(new JSONParser().parse(info));
        Long id = (Long) object.get("id");
        Integer uid = id.intValue();
        boolean result = false;
        //由于更新增加共用一个模态框，我们在后台进行区分
        //uid=-1，就说明，这是要添加用户
        //否则说明，这是一个更新方法
        if(uid==-1){
            result = userService.addUser(object);
        }
        else {
            result = userService.updateUserInfo(object);
        }
        if(result){
            return Msg.success();
        }
        else{
            return Msg.fail();
        }
    }

}
