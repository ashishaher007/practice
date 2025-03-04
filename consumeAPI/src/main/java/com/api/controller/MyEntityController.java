package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dto.MyEntity;
import com.api.service.MyEntityClientService;

@RestController
@RequestMapping("/consumer")
public class MyEntityController {

    @Autowired
    private MyEntityClientService myEntityService;
//http:localhost:9090/consumer/get
    // 1. Fetch all records
    @GetMapping("/get")
    public List<MyEntity> getAllRecords() {
        return myEntityService.getAllRecords();
    }

    // 2. Create a new record
    @PostMapping("/save")
    public MyEntity createRecord(@RequestBody MyEntity entity) {
        return myEntityService.createRecord(entity);
    }

    // 3. Update a record
    @PutMapping("/update/{id}")
    public MyEntity updateRecord(@PathVariable Long id, @RequestBody MyEntity entity) {
        return myEntityService.updateRecord(id, entity);
    }

    // 4. Delete a record
    @DeleteMapping("/delete/{id}")
    public String deleteRecord(@PathVariable Long id) {
        myEntityService.deleteRecord(id);
        return "Record with ID " + id + " deleted successfully!";
    }
}
