package com.bilgeadam.utility;

import com.bilgeadam.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

    private static SessionFactory sessionFactoryHibernate(){

        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(User.class); //mapping - hibernate.cfg.xml dosyasında mapping yapmak yerine bu da yapılabilir.
            SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
}
