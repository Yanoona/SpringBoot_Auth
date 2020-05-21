package com.cblz.medical_big_data.controller.system;

import com.cblz.medical_big_data.entity.system.SystemUser;
import com.cblz.medical_big_data.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.controller.system
 * @Author: Yan
 * @CreateTime: 2020-05-20 16:01
 * @Description: 系统用户控制层
 */
@Controller
@RequestMapping("systemUser")
public class SystemUserController {

    @Autowired
    private SystemUserService systemUserService;

    @GetMapping("/info/{userName}")
    public SystemUser getUserInfoByName(@PathVariable("userName") String userName){
        SystemUser systemUser = systemUserService.findInfoByName(userName);
        System.out.println(systemUser.getMobile());
        return systemUserService.findInfoByName(userName);
    }
    @GetMapping("/hello")
    public String hello(ModelAndView modelAndView){
        modelAndView.addObject("hello","你好，世界");
        return  "system/hello";
    }
}
