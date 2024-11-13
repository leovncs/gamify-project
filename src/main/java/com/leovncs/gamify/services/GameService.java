package com.leovncs.gamify.services;

import com.leovncs.gamify.dto.GameDTO;
import com.leovncs.gamify.dto.GameMinDTO;
import com.leovncs.gamify.entities.Game;
import com.leovncs.gamify.exceptions.GameNotFoundException;
import com.leovncs.gamify.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).
                orElseThrow(() -> new GameNotFoundException(id));
        return new GameDTO(result);
    }
}
