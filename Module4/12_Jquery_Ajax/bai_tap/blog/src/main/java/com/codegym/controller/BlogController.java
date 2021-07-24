package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String listBlog(){
        List<Blog> blogs = blogService.findAll();
        return "list";
    }
    @GetMapping("/create")
    public ModelAndView createBlog(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog",new Blog());
        modelAndView.addObject("category",categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveBlog(@ModelAttribute Blog blog){
        if (blog.getId()==0){
            blog.setCreateTime(LocalDate.now());
        }
        Blog lastBlog = blogService.save(blog);
        return "redirect:/" ;
    }
}
