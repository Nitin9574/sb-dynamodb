package com.qualigy.sbdynamodb.controller;


import com.qualigy.sbdynamodb.model.Primary;

import com.qualigy.sbdynamodb.service.PrimaryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class PrimaryController {

    @Autowired
    private PrimaryService primaryService;

    @PostMapping("/primary")
    public String createPrimary(@RequestBody Primary primary){
        return primaryService.createPrimary(primary);
    }


    @GetMapping("/primary/{id}/{name}")
    public Primary getPrimaryById(@PathVariable String id,@PathVariable String name){
       Primary pr =  primaryService.getPrimary(id, name);
        return  pr;
    }

    @PutMapping("/primary/{id}")
    public Primary updatePrimary(@PathVariable String id, @RequestBody Primary primary){
        return primaryService.updatePrimary(id, primary);
    }

    @DeleteMapping("/primary/{id}")
    public String deletePrimary(@PathVariable String id){
        return primaryService.deletePrimary(id);
    }
}
