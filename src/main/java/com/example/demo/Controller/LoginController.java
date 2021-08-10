package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
    @RequestMapping("/login")
    public String showMyLoginPage() {
        return "login-page";
    }
    @RequestMapping("/index")
    public String goOn(){
        return "index";
    }
    // add request mapping for /access-denied
    @PostMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
