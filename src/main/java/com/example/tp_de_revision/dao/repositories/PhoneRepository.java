package com.example.tp_de_revision.dao.repositories;

import com.example.tp_de_revision.dao.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    public List<Phone> getAllPhonesByModel(String model);
    public List<Phone> getAllPhonesByPrice(double price);
    public List<Phone> getAllPhonesByModelAndPrice(String model, double price);
    public Phone getPhoneByIMEI(String imei);
    //delete
    public void deletePhonesByIMEI(String IMEI);
}
