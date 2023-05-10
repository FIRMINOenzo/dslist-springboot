package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        // var == List<Game>
        var result = gameRepository.findAll();

        // retorna uma List<GameMinDTO>
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        // Usamos .get() pois ele retorna o tipo Optional
        Game result = gameRepository.findById(id).get();

        // Retorna um único game no padrão DTO
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        // var == List<GameMinProjection>
        var result = gameRepository.searchByList(listId);

        // retorna uma List<GameMinDTO>
        return result.stream().map(GameMinDTO::new).toList();
    }
}
