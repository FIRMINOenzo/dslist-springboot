package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game id_game;

    @ManyToOne
    @JoinColumn(name = "id_game_list")
    private GameList id_list;

    public BelongingPK() {

    }

    public BelongingPK(Game id_game, GameList id_list) {
        this.id_game = id_game;
        this.id_list = id_list;
    }

    public Game getId_game() {
        return id_game;
    }

    public void setId_game(Game id_game) {
        this.id_game = id_game;
    }

    public GameList getId_list() {
        return id_list;
    }

    public void setId_list(GameList id_list) {
        this.id_list = id_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(id_game, that.id_game) && Objects.equals(id_list, that.id_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_game, id_list);
    }
}
