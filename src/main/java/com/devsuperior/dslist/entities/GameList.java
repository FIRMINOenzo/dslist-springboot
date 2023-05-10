package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "game_list")
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_game_list;

    private String ds_name;

    public GameList() {

    }

    public GameList(Long id_game_list, String ds_name) {
        this.id_game_list = id_game_list;
        this.ds_name = ds_name;
    }

    public Long getId_game_list() {
        return id_game_list;
    }

    public void setId_game_list(Long id_game_list) {
        this.id_game_list = id_game_list;
    }

    public String getDs_name() {
        return ds_name;
    }

    public void setDs_name(String ds_name) {
        this.ds_name = ds_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id_game_list, gameList.id_game_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_game_list);
    }
}
