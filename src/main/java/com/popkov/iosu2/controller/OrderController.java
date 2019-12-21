package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Orders;
import com.popkov.iosu2.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/showAllOrders")
    public String showAll(Model model){
        List list = ordersService.findAllOrders();
        model.addAttribute("orderlist",list);
        return "order/order";
    }

    @GetMapping("/addOrder")
    public String addOrder(Model model){
        model.addAttribute("norder",new Orders());
        return "order/addorder";
    }

    @PostMapping("/addOrder")
    public String addOrderSubmit(@ModelAttribute(name = "norder") Orders orders){
        ordersService.addOrder(orders.getCustomers(),orders.getServiceID(),orders.getStaffID(),orders.getPermission(),
                orders.getDate(),orders.getVidName(),orders.getVidLength());
        return "redirect:/showAllOrders";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam(name = "id") int id){
        ordersService.deleteOrderById(id);
        return "redirect:/showAllOrders";
    }
}
