package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AreaOffice;

public interface IofficeService {

	AreaOffice createAreaOffice(AreaOffice areaOffice);
    AreaOffice updateAreaOffice(Integer id, AreaOffice areaOffice);
    AreaOffice getAreaOfficeById(Integer id);
    List<AreaOffice> getAllAreaOffices();
    void deleteAreaOffice(Integer id);
}
