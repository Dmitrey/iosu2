package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Customers;
import com.popkov.iosu2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/addCus")
    public String CustomerAdd(Model model){
        model.addAttribute("ncustomer", new Customers());
        return "customer/addcustomer";
    }

    @PostMapping("/addCus")
    public String CustomerAddSubmit(@ModelAttribute("ncustomer") Customers customers){
        customerService.addCustomer(customers.getName(),customers.getType(),customers.getPhone(),customers.getCity());
        return "redirect:/showAllCus";
    }

    @GetMapping("/showAllCus")
    public String showStaff(Model model){
        List<Customers> list = customerService.findAllServices();
        model.addAttribute("cuslist",list);
        return "customer/customer";
    }

    @GetMapping("/deleteCus")
    public String deleteStaff(@RequestParam int id){
        customerService.deleteCustomerById(id);
        return "redirect:/showAllCus";
    }
}
