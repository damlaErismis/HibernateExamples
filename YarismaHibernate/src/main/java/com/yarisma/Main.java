package com.yarisma;

import com.yarisma.entity.Kullanici;
import com.yarisma.entity.Yarisma;
import com.yarisma.entity.YarismaKatilim;
import com.yarisma.utility.HibernateUtility;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = HibernateUtility.getSessionFactory().openSession();

        Kullanici kullanici1 = new Kullanici("Damla", "Erişmiş", "Avatar1", "email", "1234");
        Kullanici kullanici2 = new Kullanici("Derya", "Paksoy", "avatar2", "email2", "0123");

        session.beginTransaction();
        session.save(kullanici1);
        session.save(kullanici2);
        session.getTransaction().commit();

        Yarisma yarisma1 = new Yarisma();
        yarisma1.setKullanici(kullanici1);
        yarisma1.setBaslangicTarihi(yarisma1.getBaslangicTarihi());
        yarisma1.setBitisTarihi(yarisma1.getBitisTarihi());
        yarisma1.setOdul("Ödül 1");
        yarisma1.setKatilimciSayisi(5);

        Yarisma yarisma2 = new Yarisma();
        yarisma2.setKullanici(kullanici2);
        yarisma2.setBaslangicTarihi(yarisma2.getBaslangicTarihi());
        yarisma2.setBitisTarihi(yarisma2.getBitisTarihi());
        yarisma2.setOdul("Ödül 2");
        yarisma2.setKatilimciSayisi(10);

        session.beginTransaction();
        session.save(yarisma1);
        session.save(yarisma2);
        session.getTransaction().commit();


        YarismaKatilim katilim1 = new YarismaKatilim(yarisma1, kullanici1, new Date());
        YarismaKatilim katilim2 = new YarismaKatilim(yarisma2, kullanici1, new Date());
        YarismaKatilim katilim3 = new YarismaKatilim(yarisma2, kullanici2, new Date());


        session.beginTransaction();
        session.save(katilim1);
        session.save(katilim2);
        session.save(katilim3);
        session.getTransaction().commit();
        session.getTransaction().rollback();
        session.close();

        }



    }


