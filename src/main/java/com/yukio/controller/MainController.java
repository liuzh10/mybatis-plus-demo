package com.yukio.controller;

import com.yukio.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private TbUserService ictPlanService;


    @GetMapping("/batch")
    public String process() {
        ictPlanService.process();
        return "success";
    }
}
