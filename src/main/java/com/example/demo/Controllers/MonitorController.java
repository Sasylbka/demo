package com.example.demo.Controllers;

import com.example.demo.domain.dto.MonitorDTO;
import com.example.demo.domain.dto.PCDto;
import com.example.demo.services.LaptopService;
import com.example.demo.services.MonitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonitorController {
    private final MonitorService monitorService;
    public MonitorController(MonitorService monitorService){
        this.monitorService=monitorService;
    }
    @RequestMapping(method = RequestMethod.GET, path="/monitor")
    public MonitorDTO get(final int id){
       return monitorService.get(id);
    }
    @RequestMapping(method = RequestMethod.POST, path="/allMonitors")
    public List<MonitorDTO> getAll(){
        return monitorService.getAll();
    }
    @RequestMapping(method = RequestMethod.POST, path="/monitor")
    public MonitorDTO save(@RequestBody final MonitorDTO monitorDto){
        return monitorService.save(monitorDto);
    }
    @RequestMapping(method = RequestMethod.PATCH, path="/monitor")
    public MonitorDTO update(@RequestBody final MonitorDTO monitorDto){
        return monitorService.update(monitorDto);
    }
    @RequestMapping(method = RequestMethod.DELETE, path="/monitor")
    public String delete(final int id){
        return monitorService.delete(id);
    }
}
