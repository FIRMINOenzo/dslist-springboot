package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_game;
    private String ds_title;
    private Integer nr_year;
    private String ds_genre;
    private String ds_platform;
    private Double nr_score;
    private String ds_img_url;
    @Column(columnDefinition = "TEXT")
    private String ds_short_description;
    @Column(columnDefinition = "TEXT")
    private String ds_long_description;

    public Game() {

    }

    public Game(Long id_game, String ds_title, Integer nr_year, String ds_genre, String ds_platform, Double nr_score, String ds_img_url, String ds_short_description, String ds_long_description) {
        this.id_game = id_game;
        this.ds_title = ds_title;
        this.nr_year = nr_year;
        this.ds_genre = ds_genre;
        this.ds_platform = ds_platform;
        this.nr_score = nr_score;
        this.ds_img_url = ds_img_url;
        this.ds_short_description = ds_short_description;
        this.ds_long_description = ds_long_description;
    }

    public Long getId_game() {
        return id_game;
    }

    public void setId_game(Long id_game) {
        this.id_game = id_game;
    }

    public String getDs_title() {
        return ds_title;
    }

    public void setDs_title(String ds_title) {
        this.ds_title = ds_title;
    }

    public Integer getNr_year() {
        return nr_year;
    }

    public void setNr_year(Integer nr_year) {
        this.nr_year = nr_year;
    }

    public String getDs_genre() {
        return ds_genre;
    }

    public void setDs_genre(String ds_genre) {
        this.ds_genre = ds_genre;
    }

    public String getDs_platform() {
        return ds_platform;
    }

    public void setDs_platform(String ds_platform) {
        this.ds_platform = ds_platform;
    }

    public Double getNr_score() {
        return nr_score;
    }

    public void setNr_score(Double nr_score) {
        this.nr_score = nr_score;
    }

    public String getDs_img_url() {
        return ds_img_url;
    }

    public void setDs_img_url(String ds_img_url) {
        this.ds_img_url = ds_img_url;
    }

    public String getDs_short_description() {
        return ds_short_description;
    }

    public void setDs_short_description(String ds_short_description) {
        this.ds_short_description = ds_short_description;
    }

    public String getDs_long_description() {
        return ds_long_description;
    }

    public void setDs_long_description(String ds_long_description) {
        this.ds_long_description = ds_long_description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id_game, game.id_game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_game);
    }
}
