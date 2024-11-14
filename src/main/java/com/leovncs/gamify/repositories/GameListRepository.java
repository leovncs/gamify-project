package com.leovncs.gamify.repositories;

import com.leovncs.gamify.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
