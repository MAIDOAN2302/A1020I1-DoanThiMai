package vn.codegym.ung_dung_blog_string_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.ung_dung_blog_string_boot.model.Blog;
import vn.codegym.ung_dung_blog_string_boot.service.BlogService;


import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/")
    public String home(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("list",blogs);
        return "home";
    }
    @GetMapping("/create")
    public String formCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("successMsg", "create content by: "
                + blog.getUser() + " OK");
        blogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("blog/{id}/edit")
    public String formEdit(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("successMsg", "Update content by: "
                + blog.getUser() + " OK");
        blogService.update(blog);
        return "redirect:/";
    }
    @GetMapping("blog/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirectAttributes ){
        Blog blog = blogService.findById(id);
        if (blog!=null) {
            redirectAttributes.addFlashAttribute("successMsg", "Delete content by: "
                    + blog.getUser() + " OK");
            blogService.remove(blog);
        }else {
            redirectAttributes.addFlashAttribute("successMsg", "Blogs not found");
        }
        return "redirect:/";
    }
}
