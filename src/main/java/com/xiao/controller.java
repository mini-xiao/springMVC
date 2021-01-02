package com.xiao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/controller")
    public String testController() {
        System.out.println("test controller!!!");
        return "success";
    }
}
