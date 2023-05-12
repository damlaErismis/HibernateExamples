package com.damla.controller;

import com.damla.entity.Arac;
import com.damla.service.AracService;
import com.damla.util.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AracController {

    private AracService aracService;

    public AracController(){
        this.aracService = new AracService();
    }

    public void save(Arac arac) {
        aracService.save(arac);
    }

    public List<Arac> findByMarkaAndModel(String marka, String model) {

       return aracService.findByMarkaAndModel(marka,model);
    }
}
