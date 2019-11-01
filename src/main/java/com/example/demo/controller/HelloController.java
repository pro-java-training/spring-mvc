package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @date 2019/11/1 18:35
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "searchPage";
    }

    @RequestMapping("/result")
    public String result(
            @RequestParam(defaultValue = "java") String search,
            Model model) {
        Map<String, String> results = new HashMap<>();
        results.put("apple", "$3.8");
        model.addAttribute("results", results);
        model.addAttribute("search", search);
        return "searchPage";
    }
}
