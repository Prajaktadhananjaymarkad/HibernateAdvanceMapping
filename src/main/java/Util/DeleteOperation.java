package Util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
//DELETE ANY ONE RECORD FROM PASSPORT TABLE WITHOUT DELETING RECORDS FROM PERSON TABLE
public class DeleteOperation {
    public static void main(String[] args) {
        Session session=SessionFactoryObject.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Query query=session.createQuery("update Person p set p.passportRef=null where p.passportRef=1011");
        query.executeUpdate();
        tx.commit();
        Transaction tx1= session.beginTransaction();
        Query query1= session.createQuery("delete from Passport pass where pass.passportId=1011");
        query1.executeUpdate();
        tx1.commit();
        session.close();

    }
}
