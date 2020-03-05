package com.example.lclepro.Controller;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Service.TestService;
import com.example.lclepro.Service.UserService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("test")
@Controller
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/login")
    @ResponseBody
    public Msg login(@RequestParam("name") String name,
                   @RequestParam("password") String password){
        System.out.println(name+"--->"+password);
        return Msg.success();
    }

    @PostMapping("/addthing")
    @ResponseBody
    public Msg addthing(@RequestBody String url) throws ParseException {
        JSONObject object = (JSONObject)(new JSONParser().parse(url));
        System.out.println("--->"+object.get("firstName"));

        return Msg.success();
    }

    @GetMapping("/getCars")
    @ResponseBody
    public Msg getCars(){
        List<LcleCustomer> info = testService.getAllCustomers();
        if(info != null){
            return Msg.success().add("data", info);
        }
        else {
            return Msg.fail().add("error", "网络开小差了，请稍后重试！");
        }
    }

    @PostMapping("/addCar")
    @ResponseBody
    public Msg addCar(@RequestBody LcleCustomer lcleCustomer){
        System.out.println("-->"+lcleCustomer);
        Integer result = testService.addCustomer(lcleCustomer);
        if(result != null){
            return Msg.success();
        }
        else {
            return Msg.fail();
        }
    }

    @GetMapping("delCar")
    @ResponseBody
    public Msg delCustomer(@RequestParam("Id") Integer Id){
        testService.delCustomer(Id);
        return Msg.success();
    }

}
