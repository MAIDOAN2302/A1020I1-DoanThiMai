package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Province;
import vn.codegym.service.CustomerService;
import vn.codegym.service.ProvinceService;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/province")
    public ModelAndView listProvince(){
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("province/listProvince");
        modelAndView.addObject("provinces",provinces);
        return modelAndView;
    }
    @GetMapping("/create")
    public String createProvince(Model model){
        Province province = new Province();
        model.addAttribute("province",province);
        return "province/createProvince";
    }
    @PostMapping("/create")
    public String saveProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @GetMapping("/updateProvince")
    public String updateProvince(@RequestParam("id") int id, Model model){
        Province province = provinceService.findById(id);
        if (province!=null){
            model.addAttribute("province",province);
            return "province/editProvince";
        }else {
            return "error";
        }
    }
    @PostMapping("/updateProvince")
    public String saveUpdatedProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @GetMapping("/deleteProvince")
    public String deleteProvince(@RequestParam("id") int id){
        provinceService.remove(id);
        return "redirect:/province";
    }

}
