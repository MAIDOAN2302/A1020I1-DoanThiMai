package com.example.demo.controller;

import com.example.demo.Service.BlogService;
import com.example.demo.Service.ECommerceService;
import com.example.demo.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    ECommerceService eCommerceService;

    @GetMapping(value = "/blog")
    public String listBlog(Optional<String> key_search, Optional<Integer> ecomId, @PageableDefault Pageable pageable, Model model){
        model.addAttribute("ecommers", eCommerceService.findAll());
        if (!key_search.isPresent()){
            if (ecomId.isPresent()){
                Page<Blog> blog = blogService.findAllBlogByECommerce(ecomId.get(), pageable);
                model.addAttribute("blogs", blog);
                model.addAttribute("ecomId", ecomId.get());
                return "blog/list";
            }
            model.addAttribute("blogs", blogService.fillAllBlog(pageable));
            return "blog/list";
        } else {
            model.addAttribute("key_search", key_search.get());
            model.addAttribute("blogs", blogService.findAllByAuthor(key_search.get(), pageable));
            return "blog/list";
        }
    }

    @GetMapping(value = "/blog/create")
    public String viewCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping(value = "/blog/save")
    public String saveBlog(@ModelAttribute Blog blog){
        blogService.saveBlog(blog);
        return "redirect:/blog";
    }

}
