package customers.controller;

import customers.service.CustomerService;
import customers.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class CustomerController {
    CustomerService customerService = new CustomerServiceImpl();
@RequestMapping(value = "/customer",method = RequestMethod.GET)

    public ModelAndView showCustomerList (){
    return new ModelAndView("list","customerList",customerService.findAll());
}
}
