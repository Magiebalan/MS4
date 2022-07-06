package com.springboot.playerdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.playerdata.entity.ClassPlayerData;
import com.springboot.playerdata.servicelayer.PlayerService;

import java.util.List;

@RestController
public class CricketDataController {

    @Autowired
    private PlayerService service;

    @GetMapping("/player/{id}")
    public ClassPlayerData getPlayerById(@PathVariable int id) {
        return service.getPlayerById(id);
    }

    @GetMapping("/Player")
    public List<ClassPlayerData> getPlayer(){
        return service.getAllPlayer();
    }
    @PostMapping("/Player")
    public ClassPlayerData savePlayer(@RequestBody ClassPlayerData Player) {
        return service.addPlayer(Player);
    }

}