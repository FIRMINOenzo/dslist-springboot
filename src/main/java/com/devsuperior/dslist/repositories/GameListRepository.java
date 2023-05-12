package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE belonging SET nr_position = :newPosition WHERE id_game_list = :listId AND id_game = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
