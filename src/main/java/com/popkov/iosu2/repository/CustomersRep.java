package com.popkov.iosu2.repository;

import com.popkov.iosu2.entity.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRep extends CrudRepository<Customers,Integer> {
    List<Customers> findAll();
}
