package com.example.demo.controller;

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

import com.example.demo.model.AreaOffice;
import com.example.demo.service.OfficeServiceImpl;


@RestController
@RequestMapping("/api/areaoffice")
public class AreaController {
	
	 @Autowired
	    private OfficeServiceImpl officeServiceImpl;

	    @PostMapping
	    public AreaOffice create(@RequestBody AreaOffice areaOffice) {
	        return officeServiceImpl.createAreaOffice(areaOffice);
	    }
	    @PutMapping("/{id}")
	    public AreaOffice update(@PathVariable Integer id, @RequestBody AreaOffice areaOffice) {
	        return officeServiceImpl.updateAreaOffice(id, areaOffice);
	    }

	    @GetMapping("/{id}")
	    public AreaOffice getById(@PathVariable Integer id) {
	        return officeServiceImpl.getAreaOfficeById(id);
	    }

	    @GetMapping
	    public List<AreaOffice> getAll() {
	        return officeServiceImpl.getAllAreaOffices();
	    }

	    @DeleteMapping("/{id}")
	    public String delete(@PathVariable Integer id) {
	    	officeServiceImpl.deleteAreaOffice(id);
	        return "Deleted successfully with id: " + id;
	    }
	    
    }
