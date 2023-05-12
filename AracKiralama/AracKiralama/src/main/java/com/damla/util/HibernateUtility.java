package com.damla.util;


import com.damla.entity.Arac;
import com.damla.entity.Kiralama;
import com.damla.entity.Musteri;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
    private static SessionFactory sessionFactoryHibernate() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Arac.class);
            configuration.addAnnotatedClass(Kiralama.class);
            configuration.addAnnotatedClass(Musteri.class);

            SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}

