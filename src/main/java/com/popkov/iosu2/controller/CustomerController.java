package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Customers;
import com.popkov.iosu2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
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
    public List<Customers> showStaff(Model model){
        List<Customers> list = customerService.findAllServices();
        model.addAttribute("cuslist",list);
        return list;
    }

    @GetMapping("/deleteCus")
    public String deleteStaff(@RequestParam int id){
        customerService.deleteCustomerById(id);
        return "redirect:/showAllCus";
    }
}
