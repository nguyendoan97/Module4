package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("index")
    public String index(){
        return "/index";
    }

    @PostMapping("result")
    public String result(@RequestParam int first,@RequestParam int last,@RequestParam char calculation, Model model){
        int result = 0;
        switch (calculation){
            case '+':
                result = first + last;
                break;
            case '-':
                result = first - last;
                break;
            case '*':
                result = first * last;
                break;
            case '/':
                result = first / last;
                break;
            default:
                System.out.println("error");
                break;
        }
        model.addAttribute("result",result);
        return "/index";
    }
}
