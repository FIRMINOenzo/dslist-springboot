package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game ds_game;

    @ManyToOne
    @JoinColumn(name = "id_game_list")
    private GameList ds_list;

    public BelongingPK() {

    }

    public BelongingPK(Game ds_game, GameList ds_list) {
        this.ds_game = ds_game;
        this.ds_list = ds_list;
    }

    public Game getDs_game() {
        return ds_game;
    }

    public void setDs_game(Game ds_game) {
        this.ds_game = ds_game;
    }

    public GameList getDs_list() {
        return ds_list;
    }

    public void setDs_list(GameList ds_list) {
        this.ds_list = ds_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(ds_game, that.ds_game) && Objects.equals(ds_list, that.ds_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ds_game, ds_list);
    }
}
