package com.popkov.iosu2.repository;

import com.popkov.iosu2.entity.Staff;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StaffRep extends CrudRepository<Staff,Long> {
    List<Staff> findAll();
}
