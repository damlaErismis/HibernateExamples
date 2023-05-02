package com.yarisma.controller;

import com.yarisma.entity.YarismaKatilim;
import com.yarisma.service.KullaniciService;
import com.yarisma.service.YarismaKatilimService;
import com.yarisma.service.YarismaService;

public class YarismaKatilimController {

    private YarismaKatilimService yarismaKatilimService;
    private YarismaService yarismaService;
    private KullaniciService kullaniciService;

    public YarismaKatilimController(){
        this.yarismaKatilimService = new YarismaKatilimService();
        this.yarismaService = new YarismaService();
        this.kullaniciService = new KullaniciService();
    }


}


