package com.example.tp_de_revision.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PhoneDTO {
    private int id;
    private String model;
    private String color;
    private String IMEI;
    private Double price;
}