package com.codegym.controller;

import com.codegym.model.ImageComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.codegym.service.ImageService;

import java.util.List;

@Controller
@RequestMapping("images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<ImageComment> imageComments = imageService.findAll();
        modelAndView.addObject("image", imageComments);
        return modelAndView;
    }

}
