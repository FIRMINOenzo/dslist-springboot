package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {
    private Long id_game;
    private String ds_title;
    private Integer nr_year;
    private String ds_genre;
    private String ds_platform;
    private Double nr_score;
    private String ds_img_url;
    private String ds_short_description;
    private String ds_long_description;

    public GameDTO() {

    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
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
}
