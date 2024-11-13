package com.tvsjazz.dslist.services;

import com.tvsjazz.dslist.dto.GameMinDTO;
import com.tvsjazz.dslist.entities.Game;
import com.tvsjazz.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
