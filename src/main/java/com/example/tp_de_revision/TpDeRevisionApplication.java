package com.example.tp_de_revision;

import com.example.tp_de_revision.dao.entities.Phone;
import com.example.tp_de_revision.dao.repositories.PhoneRepository;
//import com.example.tp_de_revision.service.dtos.PhoneDTO;
//import com.example.tp_de_revision.service.mappers.PhoneMapper;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TpDeRevisionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpDeRevisionApplication.class, args);
    }
    @Bean
    CommandLineRunner start(PhoneRepository phoneRepository) {
        Faker faker = new Faker();
        return (args)->{
            List<Phone> phoneList = new ArrayList<>();
            phoneList.add(new Phone("S21","blue","11223344",2000.));
            phoneList.add(new Phone("S24","gray","22334455",8000.));
            phoneList.add(new Phone("Iphone X","black","33445566",2000.));
            phoneList.add(new Phone("Iphone 15","purple","44556677",9000.));
//            for(int i=0;i<100;i++){
//                phoneList.add(
//                        new Phone(
//                                "S"+ (int) (Math.random() * 30),
//                                faker.color().name(),
//                                ""+faker.number().randomNumber(24,false),
//                                Math.random()*3000
//                        )
//                );
//            }

          phoneRepository.saveAll(phoneList);
        };
    }
}
