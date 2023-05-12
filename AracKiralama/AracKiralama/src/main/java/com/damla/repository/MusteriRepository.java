package com.damla.repository;

import com.damla.entity.Musteri;
import com.damla.util.MyFactoryRepository;

public class MusteriRepository extends MyFactoryRepository<Musteri, Long> {
    public MusteriRepository(){
        super(new Musteri());
    }
}
