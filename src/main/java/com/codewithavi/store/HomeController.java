package com.codewithavi.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")    //run time it associated with the this key and inject the value into our private field
    private String appName;
    @RequestMapping("/")
    public String index(){
        System.out.println("appName:"+appName); //after run this then refresh the localhost to see the print statement in this console
        return "index.html";
    }
}
