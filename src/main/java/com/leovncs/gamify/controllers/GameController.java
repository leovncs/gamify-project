package com.leovncs.gamify.controllers;

import com.leovncs.gamify.dto.GameDTO;
import com.leovncs.gamify.dto.GameMinDTO;
import com.leovncs.gamify.exceptions.GameNotFoundException;
import com.leovncs.gamify.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @ExceptionHandler(GameNotFoundException.class)
    ProblemDetail handleGameNotFound(GameNotFoundException e) {
        return e.toProblemDetail();
    }
}
