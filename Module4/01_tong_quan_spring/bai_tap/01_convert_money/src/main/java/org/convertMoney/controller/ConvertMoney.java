package org.convertMoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller

public class ConvertMoney {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String input(){
        return "index";
    }
    @RequestMapping(value = "/showResult", method = RequestMethod.GET)
   public String getResult(@RequestParam double usd, Model model){
        double vnd = usd * 23000;
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "showResult";
    }

}
