package com.damla.service;

import com.damla.entity.Arac;
import com.damla.repository.AracRepository;
import com.damla.util.MyFactoryService;

import java.util.List;

public class AracService extends MyFactoryService<AracRepository, Arac, Long> {

    public AracService(){
        super(new AracRepository());
    }


    public List<Arac> findByMarkaAndModel(String marka, String model) {

      return getRepository().findBYMarkaAndModel(marka,model);
    }
}
