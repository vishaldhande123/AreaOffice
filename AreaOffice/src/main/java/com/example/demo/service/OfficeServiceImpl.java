package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AreaOffice;
import com.example.demo.repo.AreaOfficeRepo;

@Service
	public class OfficeServiceImpl implements IofficeService {

	    @Autowired
	    private AreaOfficeRepo repository;

	    @Override
	    public AreaOffice createAreaOffice(AreaOffice areaOffice) {
	        return repository.save(areaOffice);
	    }

	    @Override
	    public AreaOffice updateAreaOffice(Integer id, AreaOffice areaOffice) {
	        Optional<AreaOffice> existing = repository.findById(id);
	        if (existing.isPresent()) {
	            AreaOffice updated = existing.get();
	            updated.setName(areaOffice.getName());
	            updated.setShortName(areaOffice.getShortName());
	            updated.setAddress(areaOffice.getAddress());
	            updated.setGstin(areaOffice.getGstin());
	            updated.setPincode(areaOffice.getPincode());
	            updated.setContactNum((areaOffice.getContactNum()));
	            updated.setEmail(areaOffice.getEmail());
	            return repository.save(updated);
	        } else {
	            throw new RuntimeException("AreaOffice not found with id: " + id);
	        }
	    }

	    @Override
	    public AreaOffice getAreaOfficeById(Integer id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new RuntimeException("AreaOffice not found with id: " + id));
	    }

	    @Override
	    public List<AreaOffice> getAllAreaOffices() {
	        return repository.findAll();
	    }

	    @Override
	    public void deleteAreaOffice(Integer id) {
	        repository.deleteById(id);
	    }
	}

