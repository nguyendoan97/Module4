package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchange {
    @GetMapping("/to-usd")
    public String getForm(Model model){
        return "getform";
    }
    @PostMapping("/to-usd")
    public String vndToUsd(@RequestParam int usd, Model model){
        int vnd = usd*23000;
        model.addAttribute("exchange",vnd);
        return "/ex";
    }

}
