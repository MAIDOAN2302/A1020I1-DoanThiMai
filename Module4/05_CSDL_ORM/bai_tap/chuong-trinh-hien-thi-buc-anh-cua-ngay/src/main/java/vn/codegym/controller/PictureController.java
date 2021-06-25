package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Picture;
import vn.codegym.service.PictureService;
import vn.codegym.service.PictureServiceImpl;

@Controller
public class PictureController {
    PictureService pictureService= new PictureServiceImpl();
    @GetMapping(value = "/")
    public String showIndex(Model model){
        model.addAttribute("picture" ,new Picture());
        return "index";
    }
    @PostMapping(value = "/comment")
    public String save(Picture picture){
        pictureService.saveComment(picture);
        return "redirect:/";
    }
}
