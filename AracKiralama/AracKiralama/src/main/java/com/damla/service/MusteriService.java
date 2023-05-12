package com.damla.service;

import com.damla.entity.Musteri;
import com.damla.repository.MusteriRepository;
import com.damla.util.MyFactoryService;

public class MusteriService extends MyFactoryService<MusteriRepository, Musteri,Long> {
    public MusteriService(){
        super(new MusteriRepository());
    }
}
