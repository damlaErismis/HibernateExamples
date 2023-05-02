package com.yarisma.repository;

import com.yarisma.entity.Yarisma;
import com.yarisma.utility.MyFactoryRepository;

public class YarismaRepository extends MyFactoryRepository<Yarisma, Long> {

    public YarismaRepository(){
        super(new Yarisma());
    }
}
