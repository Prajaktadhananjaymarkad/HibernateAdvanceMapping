package Util;

import Model.Passport;
import Model.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
//DISPLAY ALL RECORDS
public class DisplayAllData extends SessionFactoryObject{
    public static void main(String[] args) {
        //using hql
        SessionFactory sessionFactory=SessionFactoryObject.sessionFactory;
        Session session=sessionFactory.openSession();
        String selectQuery="from Person p join Passport pass on p.passportRef=pass.passportId";
        Query query=session.createQuery(selectQuery);
        List<Object[]> data=query.getResultList();
        System.out.println("PID\tPNAME\tADDRESS\tNAMEONPASSPORT\tCOUNTRY");
      //  data.forEach(temp-> System.out.println(temp.toString()));
        for (Object[] o:data){
            Person personData=(Person) o[0];
            Passport passportData=(Passport) o[1];
            System.out.println(personData.getPersonId()+"\t"+personData.getPersonName()+"\t"+personData.getPersonAddress()
            +"\t"+passportData.getNameOnPassport()+"\t"+passportData.getPassportCountry());
        }

    }
}
