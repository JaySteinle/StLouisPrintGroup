package com.example.shopmaintenance.controllers;

import com.example.shopmaintenance.models.data.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping
    public String displayIndexForm(Model model){
        model.addAttribute("title", "Index");
        return "index";
    }

    @GetMapping("add")
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
//    @PostMapping("/login")


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
}