package com.springboot.playerdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.playerdata.entity.ClassPlayerData;

public interface PlayerRepository extends JpaRepository<ClassPlayerData, Integer> {

}
