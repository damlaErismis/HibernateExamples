package com.yarisma.utility;

import com.yarisma.entity.Kullanici;
import com.yarisma.entity.Yarisma;
import com.yarisma.entity.YarismaKatilim;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
    private static SessionFactory sessionFactoryHibernate() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Kullanici.class);
            configuration.addAnnotatedClass(Yarisma.class);
            configuration.addAnnotatedClass(YarismaKatilim.class);

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
