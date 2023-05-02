package com.yarisma.service;

import com.yarisma.entity.Kullanici;
import com.yarisma.repository.KullaniciRepository;
import com.yarisma.utility.MyFactoryService;




public class KullaniciService extends MyFactoryService<KullaniciRepository, Kullanici, Long> {

    public KullaniciService(){
        super(new KullaniciRepository());
    }



}
