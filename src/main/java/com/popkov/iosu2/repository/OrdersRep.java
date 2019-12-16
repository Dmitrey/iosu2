package com.popkov.iosu2.repository;

import com.popkov.iosu2.entity.Orders;
import com.popkov.iosu2.entity.Staff;
import org.hibernate.criterion.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRep extends CrudRepository<Orders,Integer> {
    List<Orders> findAll();
}
