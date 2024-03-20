package Util;

import Model.Passport;
import Model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryObject {

    public static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class).buildSessionFactory();
        Session session=sessionFactory.openSession();

    }
}
