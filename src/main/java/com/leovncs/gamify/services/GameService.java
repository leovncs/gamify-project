package com.leovncs.gamify.services;

import com.leovncs.gamify.dto.GameMinDTO;
import com.leovncs.gamify.entities.Game;
import com.leovncs.gamify.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
