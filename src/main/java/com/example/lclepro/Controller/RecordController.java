package com.example.lclepro.Controller;

import com.example.lclepro.Bean.Msg;
import com.example.lclepro.Service.RecordService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequiresPermissions("record:selectAllGradles")
    @GetMapping("/selectAllGradles")
    @ResponseBody
    public Msg selectAllGradles(){
        List<String> result = recordService.selectAllGradle();
        if(result != null){
            return Msg.success().add("data", result);
        }
        else{
            return Msg.fail().add("msg", "风太大，把老肖的信号吹跑了");
        }
    }

    @RequiresPermissions("record:selectClassname")
    @GetMapping("/selectClassname")
    @ResponseBody
    public Msg selectClassname(@RequestParam("gradle") String gradle){
        Integer Gradle = Integer.parseInt(gradle);
        List<String> result = recordService.selectClassname(Gradle);
        if(result != null){
            return Msg.success().add("data", result);
        }
        else{
            return Msg.fail().add("msg", "风太大，把老肖的信号吹跑了");
        }
    }


}
