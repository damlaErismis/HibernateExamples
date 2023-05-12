package com.damla.repository;

import com.damla.entity.Kiralama;
import com.damla.util.MyFactoryRepository;

public class KiralamaRepository extends MyFactoryRepository<Kiralama, Long> {
    public KiralamaRepository(){
        super(new Kiralama());
    }
}
