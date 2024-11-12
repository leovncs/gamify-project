package com.leovncs.gamify.repositories;

import com.leovncs.gamify.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
