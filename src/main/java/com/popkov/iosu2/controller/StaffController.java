package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

//    @RequestMapping(method = RequestMethod.GET, path = "/start")
//    public ModelAndView start(){
//        ModelAndView modelAndView = new ModelAndView("start");
//        modelAndView.setViewName("start");
//        return modelAndView;
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/start")
    //@GetMapping("/start")
    public String start(){
        return "index";
    }

    @GetMapping("/addEmp")
    public String goStaff(@RequestParam(required = true) String name, @RequestParam(required = true) String phone){
        staffService.addStaff(name,phone);
        return "redirect:/showAllEmp";
    }

    @GetMapping("/showAllEmp")
    public String showStaff(Model model){
        List<Staff> list = staffService.findAllStaff();
        for (Staff st:list) {
            System.out.println(st.toString());
        }
        model.addAttribute("list",list);
        return "staff";
    }

    @GetMapping("/deleteEmp")
    public void deleteStaff(@RequestParam int id){
        staffService.deleteStaffById(id);
    }
}
