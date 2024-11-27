package com.example.tp_de_revision.service.mappers;

import com.example.tp_de_revision.dao.entities.Phone;
import com.example.tp_de_revision.service.dtos.PhoneDTO;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {
    ModelMapper modelMapper = new ModelMapper();
    public PhoneDTO fromPhoneToPhoneDTO(Phone phone) {
        return modelMapper.map(phone, PhoneDTO.class);
    }
    public PhoneDTO fromPhoneDTOToPhone(PhoneDTO userDTO) {
        return modelMapper.map(userDTO, PhoneDTO.class);
    }
//    public Phone fromPhoneDtoInscriptionToPhone(PhoneDTO phoneDTO) {
//        return modelMapper.map(phoneDTO, Phone.class);
//    }
}
