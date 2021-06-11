package example.controller;

import example.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @Autowired
    CalculateService calculateService;
   @GetMapping("/")
    public String getHomePage(){
        return "index";
    }
    @PostMapping("/result")
    public String calculate(@RequestParam double numberOne, double numberTwo, String operator, Model model) throws Exception {
       double result = calculateService.calculate(numberOne,numberTwo,operator);
       model.addAttribute("numberOne", numberOne);
       model.addAttribute("numberTwo",numberTwo);
       model.addAttribute("operator", operator);
       model.addAttribute("result", result);
       return "index";
    }
}
