package com.codegym.controller;


import com.codegym.model.EmailConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailConfigController {

    @RequestMapping(value = "showform", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("emailConfig", new EmailConfig());
        return "/create";
    }

    @ModelAttribute("languages")
    public List<String> languages(){
        List<String> list = new ArrayList<>();
        list.add("English");
        list.add("Vietnamese");
        list.add("Thailand");
        list.add("Chinese");
        return list;
    }
    @ModelAttribute("sizes")
    public List<String> sizes(){
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("10");
        list.add("15");
        list.add("20");
        list.add("25");
        list.add("30");
        list.add("35");
        return list;
    }
    @RequestMapping(value = "addEmailConfig", method = RequestMethod.POST)
    public String submit(@ModelAttribute("emailConfig") EmailConfig emailConfig, ModelMap model) {
        model.addAttribute("language", emailConfig.getLanguage());
        model.addAttribute("size", emailConfig.getSize());
        model.addAttribute("spam", emailConfig.getSpam());
        model.addAttribute("signature", emailConfig.getSignature());
        return "/info";
    }
}