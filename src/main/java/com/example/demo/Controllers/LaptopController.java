package com.example.demo.Controllers;

import com.example.demo.domain.dto.LaptopDto;
import com.example.demo.domain.dto.MonitorDTO;
import com.example.demo.domain.dto.PCDto;
import com.example.demo.repository.PCRepository;
import com.example.demo.services.LaptopService;
import com.example.demo.services.PCService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    private final LaptopService laptopService;
    public LaptopController(LaptopService laptopService){
        this.laptopService=laptopService;
    }
    @RequestMapping(method = RequestMethod.GET, path="/laptop")
    public LaptopDto get(final int id){
        return laptopService.get(id);
    }
    @RequestMapping(method = RequestMethod.GET, path="/allLaptops")
    public List<LaptopDto> getAll(){
        return laptopService.getAll();
    }
    @RequestMapping(method = RequestMethod.POST, path="/laptop")
    public LaptopDto save(@RequestBody final LaptopDto laptopDto){
        return laptopService.save(laptopDto);
    }
    @RequestMapping(method = RequestMethod.PATCH, path="/laptop")
    public LaptopDto update(@RequestBody final LaptopDto laptopDto){
        return laptopService.update(laptopDto);
    }
    @RequestMapping(method = RequestMethod.DELETE, path="/laptop")
    public String delete(final int id){
        return laptopService.delete(id);
    }
}
