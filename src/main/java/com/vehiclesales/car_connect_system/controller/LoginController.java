package com.vehiclesales.car_connect_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // This should match the name of your HTML file (without the extension)
    }
}