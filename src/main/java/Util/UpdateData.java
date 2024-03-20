package Util;

import Model.Passport;
import Model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args) {
        Session session= new Configuration().configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory().openSession();
        Transaction tx=session.beginTransaction();

        Person person=session.load(Person.class,1);
        person.setPersonAge(25);
        session.update(person);
        tx.commit();
        session.close();
        System.out.println("DATA UPDATED");
    }
}
