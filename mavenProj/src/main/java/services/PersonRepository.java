package services;

import hibernateUtil.HibernateSessionFactoryUtil;
import models.person.PersonEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonRepository {

    public void save(PersonEntity personEntity){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(personEntity);
        tx.commit();
        session.close();
    }
    public void update(PersonEntity personEntity){

    }
}
