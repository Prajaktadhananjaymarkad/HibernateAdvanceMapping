package Util;

import Model.Passport;
import Model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        Session session= new Configuration().configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory().openSession();
        Transaction tx=session.beginTransaction();

        Person person=session.load(Person.class,2);

        session.delete(person);
        tx.commit();
        session.close();
        System.out.println("DATA DELETED");
    }
}
