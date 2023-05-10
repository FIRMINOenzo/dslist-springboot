package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query(nativeQuery = true, value = """
    SELECT g.id_game, g.ds_title, g.nr_year, g.ds_img_url, g.ds_short_description, b.nr_position
        FROM games g
        INNER JOIN belonging b ON g.id_game = b.id_game
        WHERE b.id_game_list = :listId
        ORDER BY b.nr_position
    """)
    List<GameMinProjection> searchByList(Long listId);
}
