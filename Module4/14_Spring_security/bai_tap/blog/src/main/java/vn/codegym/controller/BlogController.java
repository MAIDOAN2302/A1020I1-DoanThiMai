package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Blog;
import vn.codegym.service.BlogService;
import vn.codegym.service.CategoryService;

import java.util.Date;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String home(Blog blog, Model model){
        model.addAttribute("list", blogService.findAll());
        return "home";
    }

    @GetMapping("/create")
    public String createHome(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", categoryService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blog.setDate(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Blog " + blog.getName() + " created");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        blogService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editHome(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            model.addAttribute("blog", blog);
            return "edit";
        } else {
            redirectAttributes.addFlashAttribute("message", "Not found ");
            return "home";
        }
    }
    @GetMapping("/view/{id}")
    public String viewHome(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }
    @PostMapping("/update")
    public String edit(@ModelAttribute("blog") Blog blog, Model model, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Blog " + blog.getName() + " updated");
        return "redirect:/";
    }
}