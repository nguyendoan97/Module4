package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "form";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("con",condiment);
        return "info";
    }
}
