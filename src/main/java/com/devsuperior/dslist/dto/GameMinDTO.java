package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
    private Long id_game;
    private String ds_title;
    private Integer nr_year;
    private String ds_img_url;
    private String ds_short_description;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) {
        this.id_game = entity.getId_game();
        this.ds_title = entity.getDs_title();
        this.nr_year = entity.getNr_year();
        this.ds_img_url = entity.getDs_img_url();
        this.ds_short_description = entity.getDs_short_description();
    }

    public Long getId_game() {
        return id_game;
    }

    public String getDs_title() {
        return ds_title;
    }

    public Integer getNr_year() {
        return nr_year;
    }

    public String getDs_img_url() {
        return ds_img_url;
    }

    public String getDs_short_description() {
        return ds_short_description;
    }
}
