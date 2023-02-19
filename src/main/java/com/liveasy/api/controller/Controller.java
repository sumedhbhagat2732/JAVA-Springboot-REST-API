package com.liveasy.api.controller;

import com.liveasy.api.Loadservice.LoadService;
import com.liveasy.api.model.Loads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private LoadService loadService;
    @PostMapping("/load")
    public String addLoad(@RequestBody Loads load) {

        return this.loadService.addLoad(load);
    }
    @GetMapping("/load")
    public List<Loads>getLoad(){
        return this.loadService.getLoad();
    }

    // @GetMapping(value = "/load/{shipperId}")
    // public List<Loads> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
    //     return loadService.findByShipperId(shipperId);
    // }

    @PutMapping("/load")
    public Loads updateLoad(@RequestBody Loads load)
    {
        return this.loadService.updateLoad(load);
    }
    // @DeleteMapping("/load/{shipperId}")
    // public ResponseEntity<Void> deleteLoad(@PathVariable String shipperId) {
    //     loadService.deleteLoad(shipperId);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }



}

