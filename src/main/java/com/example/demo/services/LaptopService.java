package com.example.demo.services;

import com.example.demo.domain.dto.LaptopDto;
import com.example.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    public LaptopDto get(long id){
        return laptopRepository.findById(id).get();
    }
    @Autowired
    public List<LaptopDto> getAll(){
        if(laptopRepository.findAll().isEmpty()){return null;}
        else{return laptopRepository.findAll();}
    }
    public LaptopDto save(LaptopDto laptopDTO){
        return laptopRepository.save(laptopDTO);
    }
    public String delete (long id){
        laptopRepository.deleteById(id);
        return "Data delete";
    }
    public LaptopDto update(LaptopDto laptopDTO){
        laptopRepository.deleteById(laptopDTO.getId());
        return laptopRepository.save(laptopDTO);
    }
}
