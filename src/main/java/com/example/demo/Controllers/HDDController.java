package com.example.demo.Controllers;

import com.example.demo.domain.dto.HDDDto;
import com.example.demo.domain.dto.LaptopDto;
import com.example.demo.domain.dto.PCDto;
import com.example.demo.services.HDDService;
import com.example.demo.services.LaptopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HDDController {
    private final HDDService hddService;
    public HDDController(HDDService hddService){
        this.hddService=hddService;
    }
    @RequestMapping(method = RequestMethod.GET, path="/hdd")
    public HDDDto get(final int id){
        return hddService.get(id);
    }
    @RequestMapping(method = RequestMethod.GET, path="/allHdds")
    public List<HDDDto> getAll(){
        return hddService.getAll();
    }
    @RequestMapping(method = RequestMethod.POST, path="/hdd")
    public HDDDto save(@RequestBody final HDDDto hddDto){
        return hddService.save(hddDto);
    }
    @RequestMapping(method = RequestMethod.PATCH, path="/hdd")
    public HDDDto update(@RequestBody final HDDDto hddDto){
        return hddService.update(hddDto);
    }
    @RequestMapping(method = RequestMethod.DELETE, path="/hdd")
    public String delete(final int id){
        return hddService.delete(id);
    }
}
