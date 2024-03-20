package Util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

//DISPLAY PERSON NAME IN DESC ORDER WHO DOES NOT HAVE ANY PASSPORT
public class DisplayPersonWithoutPassport {
    public static void main(String[] args) {
        SessionFactory sessionFactory=SessionFactoryObject.sessionFactory;
        Session session=sessionFactory.openSession();
        String selectQuery="SELECT p.personName FROM Person p WHERE p.passportRef IS NULL ORDER BY p.personName DESC";
        Query<String> query = session.createQuery(selectQuery);

        List<String> personNames = query.getResultList();

        for (String personName : personNames) {
            System.out.println(personName);
        }
        session.close();
    }
}
