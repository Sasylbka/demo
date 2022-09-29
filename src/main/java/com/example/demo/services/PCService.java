package com.example.demo.services;

import com.example.demo.domain.dto.PCDto;
import com.example.demo.repository.PCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCService {
    @Autowired
    private PCRepository pcRepository;
    public PCDto get(long id){
        return pcRepository.findById(id).get();
    }
    @Autowired
    public List<PCDto> getAll(){
        if(pcRepository.findAll().isEmpty()){return null;}
        else{return pcRepository.findAll();}
    }
    public PCDto save(PCDto pcDto){
        PCDto pcDto1 = pcDto;
        return pcRepository.save(pcDto);
    }
    public String delete (long id){
        pcRepository.deleteById(id);
        return "Data delete";
    }
    public PCDto update(PCDto pcDto){
        pcRepository.deleteById(pcDto.getId());
        return pcRepository.save(pcDto);
    }
}
