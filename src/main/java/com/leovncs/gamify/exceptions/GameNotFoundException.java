package com.leovncs.gamify.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

import java.time.Instant;

public class GameNotFoundException extends RuntimeException {

    public GameNotFoundException(Long id) {
        super("Game not found with id: " + id);
    }

    public ProblemDetail toProblemDetail(){
        var pb = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);

        pb.setTitle("Game not found.");
        pb.setDetail(this.getMessage());
        pb.setProperty("timestamp", Instant.now());

        return pb;
    }
}
