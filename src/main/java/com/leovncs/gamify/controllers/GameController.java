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
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            GameDTO result = gameService.findById(id);
            return ResponseEntity.ok(result);
        } catch (GameNotFoundException e) {
            return ResponseEntity.of(Optional.of(e.toProblemDetail()));
        }
    }
}
