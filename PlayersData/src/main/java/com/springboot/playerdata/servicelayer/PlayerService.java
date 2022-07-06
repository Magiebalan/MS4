package com.springboot.playerdata.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.playerdata.Repository.PlayerRepository;
import com.springboot.playerdata.entity.ClassPlayerData;

import java.util.List;

@Service
public class PlayerService {
	    @Autowired
	    private PlayerRepository repository;

	    // to add the Player
	    public ClassPlayerData addPlayer(ClassPlayerData Player) {
	        return repository.save(Player);
	    }

	    // to get the Player based on his id
	    public ClassPlayerData getPlayerById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    // to get all the Player
	    public List<ClassPlayerData> getAllPlayer() {
	        return repository.findAll();
	    }



	    // to delete the Player
	    public String deletePlayer(int id) {
	        repository.deleteById(id);
	        return "Player deleted";
	    }
}
	