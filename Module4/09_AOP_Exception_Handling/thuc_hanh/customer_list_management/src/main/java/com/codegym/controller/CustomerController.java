package com.codegym.controller;

import com.codegym.service.CustomerService;
import com.codegym.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;

}
