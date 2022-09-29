package com.example.demo.services;

import com.example.demo.domain.dto.MonitorDTO;
import com.example.demo.domain.dto.PCDto;
import com.example.demo.repository.MonitorRepository;
import com.example.demo.repository.PCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository monitorRepository;
    public MonitorDTO get(long id){
        return monitorRepository.findById(id).get();
    }
    @Autowired
    public List<MonitorDTO> getAll(){
        if(monitorRepository.findAll().isEmpty()){return null;}
        else{return monitorRepository.findAll();}
    }
    public MonitorDTO save(MonitorDTO monitorDTO){
        return monitorRepository.save(monitorDTO);
    }
    public String delete (long id){
        monitorRepository.deleteById(id);
        return "Data delete";
    }
    public MonitorDTO update(MonitorDTO monitorDTO){
        monitorRepository.deleteById(monitorDTO.getId());
        return monitorRepository.save(monitorDTO);
    }
}
