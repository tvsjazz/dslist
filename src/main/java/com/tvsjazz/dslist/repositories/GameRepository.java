package com.tvsjazz.dslist.repositories;

import com.tvsjazz.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
