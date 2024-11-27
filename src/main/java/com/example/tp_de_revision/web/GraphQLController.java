package com.example.tp_de_revision.web;

import com.example.tp_de_revision.dao.entities.Phone;
import com.example.tp_de_revision.dao.repositories.PhoneRepository;
import com.example.tp_de_revision.service.PhoneManager;
import com.example.tp_de_revision.service.dtos.PhoneDTO;
import com.example.tp_de_revision.service.mappers.PhoneMapper;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class GraphQLController {
    public PhoneManager phoneManager;
    public GraphQLController(PhoneManager phoneManager) {
        this.phoneManager = phoneManager;
    }
    //get all phones
    @QueryMapping
    public List<Phone> getPhones(){
        return phoneManager.getAllPhones();
    }
//    getPhoneByModel(model:String):[Phone]
//    getPhoneByModelAndPrice(model:String,price:Float):[Phone]
    @QueryMapping
    public List<Phone> getPhonesByModel(@Argument String model){
        System.out.println(model);
        return phoneManager.getAllPhonesByModel(model);
    }
    @QueryMapping
    public List<Phone> getPhoneByModelAndPrice(@Argument String model,@Argument Double price){
        return phoneManager.getAAllPhonesByModelAndPrice(model,price);
    }
    //mutation
//    savePhone(phone:PhoneRequest):Phone
//    deletePhone(id:ID):String
    @MutationMapping
    public Phone savePhone(@Argument Phone phone) {
        return phoneManager.addPhone(phone);
    }
    @MutationMapping
    public Boolean deletePhone(@Argument Long id) {
        phoneManager.deletePhoneById(id);
        return true;
    }
}