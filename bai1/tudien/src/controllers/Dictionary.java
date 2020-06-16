package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Dictionary {
    @GetMapping("/get-form")
    public String getForm(Model model){
        return "get-form";
    }
    @PostMapping("/dich")
    public String dich(@RequestParam String eng,Model model){
        String result="";
        switch (eng){
            case "dog":
                result = "chó";
                break;
            case "bear":
                result = "gấu";
                break;
            case "person":
                result="người";
                break;
            case "ugly":
                result ="Long đẹp zai.ok";
                break;
            default:
                result="méo biết";
                break;
        }
        model.addAttribute("result",result);
        return "/dich-nghia";

    }
}
