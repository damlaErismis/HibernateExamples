package com.yarisma.controller;

import com.yarisma.service.KullaniciService;
import com.yarisma.service.YarismaService;


public class YarismaController {

    private YarismaService yarismaService;
    private KullaniciService kullaniciService;

    public YarismaController(){
        this.yarismaService = new YarismaService();
        this.kullaniciService = new KullaniciService();
    }




}
