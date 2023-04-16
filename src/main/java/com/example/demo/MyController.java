package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/processForm")
    public String processForm(@RequestParam("inputData") String inputData, Model model) {
        // Perform your calculations with the inputData here
        int result = // Your calculation result

                model.addAttribute("result", result);
        return "result";
    }
}
