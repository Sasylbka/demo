package com.example.demo.Controllers;
import com.example.demo.domain.dto.PCDto;
import com.example.demo.services.PCService;
import org.hibernate.mapping.Map;
import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.dto.PCDto;

import java.text.ParseException;
import java.util.List;

@RestController
public class PCController {
    private final PCService pcService;
    public PCController(PCService pcService){
        this.pcService=pcService;
    }
    @RequestMapping(method = RequestMethod.GET, path="/pc")
    public PCDto get(final long id){
        return pcService.get(id);
    }
    @RequestMapping(method = RequestMethod.GET, path="/allPcs")
    public List<PCDto> getAll(){
        return pcService.getAll();
    }
    @PostMapping(path="/pc")
    public PCDto save(@RequestBody PCDto pcDto){
        return pcService.save(pcDto);
    }
    @RequestMapping(method = RequestMethod.PATCH, path="/pc")
    public PCDto update(@RequestBody final PCDto pcDto){
        return pcService.update(pcDto);
    }
    @RequestMapping(method = RequestMethod.DELETE, path="/pc")
    public String delete(final int id){
        return pcService.delete(id);
    }
}
