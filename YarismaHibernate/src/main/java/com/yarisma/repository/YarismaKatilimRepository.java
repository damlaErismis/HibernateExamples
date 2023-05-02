package com.yarisma.repository;

import com.yarisma.entity.YarismaKatilim;
import com.yarisma.utility.MyFactoryRepository;


public class YarismaKatilimRepository  extends MyFactoryRepository<YarismaKatilim, Long> {

    public YarismaKatilimRepository(){
        super(new YarismaKatilim());
    }


}
