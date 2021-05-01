package com.example.maintenance1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private String username;
    private String password;

    public HomeController(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @GetMapping("")
    public String displayIndexForm(Model model){
        model.addAttribute("title", "Index");
        return "index";
    }

    @GetMapping("/add")
    public String displayAddForm(Model model){
        model.addAttribute("title", "Add");
        return "add";
    }

    @GetMapping("/create")
    public String displayCreateForm(Model model){
        model.addAttribute("title", "Create");
        return "create";
    }

    @GetMapping("/dashboard")
    public String displayDashboardForm(Model model){
        model.addAttribute("title", "Dashboard");
        return "dashboard";
    }

    @GetMapping("/login")
    public String displayLoginForm(Model model){
        model.addAttribute("title", "Log In");
        return "login";
    }

    @GetMapping("/logout")
    public String displayLogoutForm(Model model){
        model.addAttribute("title", "Log Out");
        return "logout";
    }


    @GetMapping("/machine")
    public String displayMachineForm(Model model){
        model.addAttribute("title", "Machine");
        return "machine";
    }

    @GetMapping("/user")
    public String displayUSerForm(Model model){
        model.addAttribute("title", "User");
        return "user";
    }

    public HomeController() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}