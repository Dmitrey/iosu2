package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ServiceController {

    @Autowired
    ServicesService servicesService;

    @GetMapping("/showAllServ")
    public String showServices(Model model){
        List<Staff> list = servicesService.findAllServices();
        model.addAttribute("servlist",list);
        return "service/service";
    }
}
