package com.example.tp_de_revision.service;

import com.example.tp_de_revision.dao.entities.Phone;
import com.example.tp_de_revision.dao.repositories.PhoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneManagerAction implements PhoneManager{
    private final PhoneRepository phoneRepository;

    public PhoneManagerAction(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Phone addPhone(Phone phone)  {
        String imei = phone.getIMEI();
        if(phoneRepository.getPhoneByIMEI(imei) != null) {
            throw new RuntimeException("Phone IMEI Already Exist");
        }

        return phoneRepository.save(phone);
    }

    @Override
    public Phone getPhoneById(Long id) {
        return phoneRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Phone not found")
        );
    }

    @Override
    public Phone getPhoneByIMEI(String imei) {
        return phoneRepository.getPhoneByIMEI(imei);
    }

    @Override
    public Phone updatePhone(Phone phone) {
        return null;
    }

    @Override
    public void deletePhoneById(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public void deletePhoneByIMEI(String imei) {
        phoneRepository.deletePhonesByIMEI(imei);
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    @Override
    public List<Phone> getAllPhonesByModel(String model) {
        return phoneRepository.getAllPhonesByModel(model);
    }

    @Override
    public List<Phone> getAllPhonesByPrice(double price) {
        return phoneRepository.getAllPhonesByPrice(price);
    }

    @Override
    public List<Phone> getAAllPhonesByModelAndPrice(String model, double price) {
        return phoneRepository.getAllPhonesByModelAndPrice(model, price);
    }
}