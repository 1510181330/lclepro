package com.example.lclepro.Controller;

import com.example.lclepro.Bean.LcleCustomer;
import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Service.FreeclassService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("freeclass")
public class FreeclassController {

    @Autowired
    private FreeclassService freeclassService;

    @RequiresPermissions("freeclass:addFreeClass")
    @ResponseBody
    @PostMapping("/addFreeClass")
    public Msg addFreeClass(@RequestBody String info) throws ParseException {
        JSONObject object = (JSONObject)(new JSONParser().parse(info));
        Subject subject = SecurityUtils.getSubject();
        LcleCustomer customer = (LcleCustomer)subject.getPrincipal();
        boolean result = freeclassService.addFreeclass(object, customer.getId());
        if(result){
            return Msg.success();
        }
        else{
            return Msg.fail();
        }
    }
}
