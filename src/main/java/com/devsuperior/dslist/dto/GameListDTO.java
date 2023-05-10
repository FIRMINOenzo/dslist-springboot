package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
    private Long id_game_list;
    private String ds_name;

    public GameListDTO() {

    }

    public GameListDTO(GameList entity) {
        this.id_game_list = entity.getId_game_list();
        this.ds_name = entity.getDs_name();
    }

    public Long getId_game_list() {
        return id_game_list;
    }

    public String getDs_name() {
        return ds_name;
    }
}
