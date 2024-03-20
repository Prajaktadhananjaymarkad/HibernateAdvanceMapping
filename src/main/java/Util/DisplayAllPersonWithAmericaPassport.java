package Util;

import Model.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

//DISPLAY ALL THE PERSON DATA WHO IS HAVING PASSPORT OF AMERICA
public class DisplayAllPersonWithAmericaPassport {
    public static void main(String[] args) {
        SessionFactory sessionFactory=SessionFactoryObject.sessionFactory;
        Session session=sessionFactory.openSession();
        String displayQuery="SELECT p FROM Person p JOIN FETCH p.passportRef pass WHERE pass.passportCountry = :country";

        Query<Person> query=session.createQuery(displayQuery);
        //Query<Person> query = session.createQuery(displayQuery, Person.class);
        query.setParameter("country", "America");

        // Execute the query and get the result list
        List<Person> people = query.getResultList();


        for (Person person : people) {
            System.out.println("Person ID: " + person.getPersonId());
            System.out.println("Person Name: " + person.getPersonName());
            System.out.println("Person Age: " + person.getPersonAge());

        }



    }
}
