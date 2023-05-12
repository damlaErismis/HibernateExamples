package com.damla.service;

import com.damla.entity.Kiralama;
import com.damla.repository.KiralamaRepository;
import com.damla.util.MyFactoryService;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    public KiralamaService(){
        super(new KiralamaRepository());
    }
}
