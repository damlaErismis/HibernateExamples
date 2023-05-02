package com.yarisma.repository;

import com.yarisma.entity.Kullanici;
import com.yarisma.utility.MyFactoryRepository;

public class KullaniciRepository  extends MyFactoryRepository<Kullanici, Long> {

    public KullaniciRepository(){
        super(new Kullanici());
    }
}
