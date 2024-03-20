package Util;

import Model.Passport;
import Model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {
    public static void main(String[] args) {
        Session session= new Configuration().configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        Passport passport=new Passport();
        passport.setPassportNumber("456788333");
        passport.setPassportCountry("INDIA");
        passport.setNameOnPassport("PRAJAKTA MARKAD");
        Person person=new Person();
        person.setPersonName("PRAJAKTA");
        person.setPersonAddress("PUNE");
        person.setPersonAge(22);
        person.setPassportRef(passport);

        Passport passport1=new Passport();
        passport1.setPassportNumber("67554434343");
        passport1.setPassportCountry("AMERICA");
        passport1.setNameOnPassport("SAKSHI TINGARE");
        Person person1=new Person();
        person1.setPersonName("SAKSHI");
        person1.setPersonAddress("AMERICA");
        person1.setPersonAge(23);
        person1.setPassportRef(passport1);

        Passport passport2=new Passport();
        passport2.setPassportNumber("6755499004343");
        passport2.setPassportCountry("INDIA");
        passport2.setNameOnPassport("KOMAL PARE");
        Person person2=new Person();
        person2.setPersonName("KOMAL");
        person2.setPersonAddress("NAGAR");
        person2.setPersonAge(24);
        person2.setPassportRef(passport2);

        Passport passport3=new Passport();
        passport3.setPassportNumber("675544344443");
        passport3.setPassportCountry("JAPAN");
        passport3.setNameOnPassport("TINA TIA");
        Person person3=new Person();
        person3.setPersonName("TINA");
        person3.setPersonAddress("JAPAN");
        person3.setPersonAge(30);
        person3.setPassportRef(passport3);


        Passport passport4=new Passport();
        passport4.setPassportNumber("67554434343");
        passport4.setPassportCountry("INDIA");
        passport4.setNameOnPassport("NEHA SALVI");
        Person person4=new Person();
        person4.setPersonName("NEHAA");
        person4.setPersonAddress("JEJURI");
        person4.setPersonAge(22);
        person4.setPassportRef(passport4);

        Passport passport5=new Passport();
        passport5.setPassportNumber("67554434343");
        passport5.setPassportCountry("INDIA");
        passport5.setNameOnPassport("SHRUTI DULARE");
        Person person5=new Person();
        person5.setPersonName("SHRUTI");
        person5.setPersonAddress("GOA");
        person5.setPersonAge(30);
        person5.setPassportRef(passport5);

        Passport passport6=new Passport();
        passport6.setPassportNumber("67554434343");
        passport6.setPassportCountry("AMERICA");
        passport6.setNameOnPassport("VAIBHAV MARKAD");
        Person person6=new Person();
        person6.setPersonName("VAIBHAV");
        person6.setPersonAddress("AMERICA");
        person6.setPersonAge(20);
        person6.setPassportRef(passport6);

        Passport passport7=new Passport();
        passport7.setPassportNumber("67554434343");
        passport7.setPassportCountry("INDIA");
        passport7.setNameOnPassport("SWATI ARJUN");
        Person person7=new Person();
        person7.setPersonName("SWATI");
        person7.setPersonAddress("SATARA");
        person7.setPersonAge(30);
        person7.setPassportRef(passport7);

        Passport passport8=new Passport();
        passport8.setPassportNumber("67554434343");
        passport8.setPassportCountry("INDIA");
        passport8.setNameOnPassport("PRYANKA GORAD");
        Person person8=new Person();
        person8.setPersonName("PRIYANKA");
        person8.setPersonAddress("AMERICA");
        person8.setPersonAge(28);
        person8.setPassportRef(passport8);

        Passport passport9=new Passport();
        passport9.setPassportNumber("67554434343");
        passport9.setPassportCountry("INDIA");
        passport9.setNameOnPassport("TUSHAR SINGH");
        Person person9=new Person();
        person9.setPersonName("TUSHAR");
        person9.setPersonAddress("PANJAB");
        person9.setPersonAge(34);
        person9.setPassportRef(passport9);

        Passport passport10=new Passport();
        passport10.setPassportNumber("67554434343");
        passport10.setPassportCountry("INDIA");
        passport10.setNameOnPassport("NEHA KHEDKAR");
        Person person10=new Person();
        person10.setPersonName("NEHA");
        person10.setPersonAddress("MUMBAI");
        person10.setPersonAge(36);
        person10.setPassportRef(passport10);

        Passport passport11=new Passport();
        passport11.setPassportNumber("67554434343");
        passport11.setPassportCountry("AMERICA");
        passport11.setNameOnPassport("SAKSHI TINGARE");
        Person person11=new Person();
        person11.setPersonName("SAKSHI");
        person11.setPersonAddress("AMERICA");
        person11.setPersonAge(23);
        person11.setPassportRef(passport11);

        Passport passport12=new Passport();
        passport12.setPassportNumber("67554434343");
        passport12.setPassportCountry("INDIA");
        passport12.setNameOnPassport("AKASH PATIL");
        Person person12=new Person();
        person12.setPersonName("AKASH");
        person12.setPersonAddress("SOLAPUR");
        person12.setPersonAge(20);
        person12.setPassportRef(passport12);

        Passport passport13=new Passport();
        passport13.setPassportNumber("67554434343");
        passport13.setPassportCountry("INDIA");
        passport13.setNameOnPassport("SURAJ ATOLE");
        Person person13=new Person();
        person13.setPersonName("SURAJ");
        person13.setPersonAddress("KOLHAPUR");
        person13.setPersonAge(25);
        person13.setPassportRef(passport13);

        Passport passport14=new Passport();
        passport14.setPassportNumber("67554434343");
        passport14.setPassportCountry("AMERICA");
        passport14.setNameOnPassport("SAKSHI MORE");
        Person person14=new Person();
        person14.setPersonName("SAKSHI");
        person14.setPersonAddress("AMERICA");
        person14.setPersonAge(23);
        person14.setPassportRef(passport14);

        Passport passport15=new Passport();
        passport15.setPassportNumber("67554434343");
        passport15.setPassportCountry("INDIA");
        passport15.setNameOnPassport("PRAJAKTA MALI");
        Person person15=new Person();
        person15.setPersonName("PRAJAKTA");
        person15.setPersonAddress("NAGPUR");
        person15.setPersonAge(22);
        person15.setPassportRef(passport15);

        Passport passport16=new Passport();
        passport16.setPassportNumber("67554434343");
        passport16.setPassportCountry("INDIA");
        passport16.setNameOnPassport("VARUN DHAVAN");
        Person person16=new Person();
        person16.setPersonName("VARUN");
        person16.setPersonAddress("MUMBAI");
        person16.setPersonAge(38);
        person16.setPassportRef(passport16);






        session.persist(person);
        session.persist(person1);
        session.persist(person2);
        session.persist(person3);
        session.persist(person4);
        session.persist(person5);
        session.persist(person6);
        session.persist(person7);
        session.persist(person8);
        session.persist(person9);
        session.persist(person10);
        session.persist(person11);
        session.persist(person12);
        session.persist(person13);
        session.persist(person14);
        session.persist(person15);
        session.persist(person16);
        tx.commit();
        session.close();
        System.out.println("DATA SAVED");
    }
}
