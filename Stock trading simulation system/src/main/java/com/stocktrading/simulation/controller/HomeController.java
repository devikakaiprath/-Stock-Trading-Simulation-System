package com.stocktrading.simulation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String index(Model model) {
        model.addAttribute("username", "Hari");
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard.html";
    }

    @GetMapping("/trade")
    public String trade() {
        return "trade.html";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }
}
