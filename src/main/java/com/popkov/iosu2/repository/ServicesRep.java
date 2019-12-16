package com.popkov.iosu2.repository;

import com.popkov.iosu2.entity.Services;
import com.popkov.iosu2.entity.Staff;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServicesRep extends CrudRepository<Services,Integer> {
    List<Services> findAll();
}
