package com.popkov.iosu2.service;

import com.popkov.iosu2.entity.Customers;
import com.popkov.iosu2.entity.Orders;
import com.popkov.iosu2.entity.Services;
import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.repository.OrdersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    OrdersRep ordersRep;

    public void addOrder(Customers customers, Services serviceID, Staff staffID,
                         String permission, String date, String vidName, double vidLength){
        ordersRep.save(new Orders(customers,serviceID,staffID,permission,date,vidName,vidLength));
    }

    public void deleteOrderById(int id){
        ordersRep.deleteById(id);
    }

    public List findAllOrders(){
        return ordersRep.findAll();
    }
}
