package com.example.tp_de_revision.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phone {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Phone;
    private String model;
    private String color;
    //getter
    @Getter
    private String IMEI;
    private Double price;
    public Phone(String model, String color, String IMEI, Double price) {
        this.model = model;
        this.color = color;
        this.IMEI = IMEI;
        this.price = price;

    }
}