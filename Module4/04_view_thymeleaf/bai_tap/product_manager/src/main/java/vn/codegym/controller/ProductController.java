package vn.codegym.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Product;
import vn.codegym.service.ProductService;
import vn.codegym.service.ProductServiceImpl;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String index(Model model) {

        List productList = productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String save(Product product) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/product/update")
    public String update(Product product,RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("success","Update product successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }
    @PostMapping("/product/delete")
    public String delete (Product product, RedirectAttributes redirectAttributes){
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("success","Remove product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String view (@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/view";
    }
}