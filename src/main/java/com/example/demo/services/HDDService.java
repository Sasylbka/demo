package com.example.demo.services;

import com.example.demo.domain.dto.HDDDto;
import com.example.demo.repository.HDDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HDDService {
    @Autowired
    private HDDRepository hddRepository;
    public HDDDto get(long id){
        return hddRepository.findById(id).get();
    }
    @Autowired
    public List<HDDDto> getAll(){
        if(hddRepository.findAll().isEmpty()){return null;}
        else{return hddRepository.findAll();}
    }
    public HDDDto save(HDDDto hddDto){
        return hddRepository.save(hddDto);
    }
    public String delete (long id){
        hddRepository.deleteById(id);
        return "Data delete";
    }
    public HDDDto update(HDDDto hddDto){
        hddRepository.deleteById(hddDto.getId());
        return hddRepository.save(hddDto);
    }
}
