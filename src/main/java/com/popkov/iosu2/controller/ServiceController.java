package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Services;
import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ServiceController {

    @Autowired
    ServicesService servicesService;

    @GetMapping("/addServ")
    public String addServ(Model model){
        model.addAttribute("nserv",new Services());
        return "service/addservice";
    }

    @PostMapping("/addServ")
    public String addServSubmit(@ModelAttribute(name = "nserv") Services services ){
        servicesService.addService(services.getServiceName(),services.getPrice());
        return "redirect:/showAllServ";
    }

    @GetMapping("/showAllServ")
    public String showServices(Model model){
        List<Services> list = servicesService.findAllServices();
        model.addAttribute("servlist",list);
        return "service/service";
    }

    @GetMapping("/deleteServ")
    public String deleteServ(@RequestParam int id){
        servicesService.deleteServiceById(id);
        return "redirect:/showAllServ";
    }
}
