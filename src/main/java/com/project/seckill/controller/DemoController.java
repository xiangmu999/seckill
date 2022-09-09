package com.project.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author D&M
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test")
    public String demo(Model model){
        model.addAttribute("name","test");
        return "test";
    }
}
