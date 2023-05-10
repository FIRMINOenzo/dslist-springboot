package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "Belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id_belonging = new BelongingPK();
    private Integer nr_position;

    public Belonging() {

    }

    public Belonging(Game game, GameList list, Integer nr_position) {
        this.id_belonging.setId_game(game);
        this.id_belonging.setId_list(list);
        this.nr_position = nr_position;
    }

    public BelongingPK getId_belonging() {
        return id_belonging;
    }

    public void setId_belonging(BelongingPK id_belonging) {
        this.id_belonging = id_belonging;
    }

    public Integer getNr_position() {
        return nr_position;
    }

    public void setNr_position(Integer nr_position) {
        this.nr_position = nr_position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id_belonging, belonging.id_belonging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_belonging);
    }
}
