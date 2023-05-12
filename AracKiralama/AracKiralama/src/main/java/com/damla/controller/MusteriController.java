package com.damla.controller;


import com.damla.entity.Musteri;
import com.damla.service.MusteriService;

public class MusteriController {

    private MusteriService musteriService;

    public MusteriController(){
        this.musteriService = new MusteriService();
    }

    public void save(Musteri musteri) {
        musteriService.save(musteri);
    }
}
