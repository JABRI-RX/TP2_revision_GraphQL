package com.example.tp_de_revision.service;

import com.example.tp_de_revision.dao.entities.Phone;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PhoneManager {
    Phone addPhone(Phone phone);
    Phone getPhoneById(Long id);
    Phone getPhoneByIMEI(String imei);
    Phone updatePhone(Phone phone);
    void deletePhoneById(Long id);
    void deletePhoneByIMEI(String imei );
    List<Phone> getAllPhones();
    List<Phone> getAllPhonesByModel(String model);
    List<Phone> getAllPhonesByPrice(double price);
    List<Phone> getAAllPhonesByModelAndPrice(String model, double price);
}