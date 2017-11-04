package net.kmf.persistance;

import net.kmf.entity.Person;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Person dao.
 */
public class PersonDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Return a list of all peoples
     *
     * @return All peoples
     */
    public List<Person> getAllPeoples() {
        List<Person> people = new ArrayList<Person>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            people = session.createCriteria(Person.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all people", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return people;
    }

    /**
     * Get a single people for the given id
     *
     * @param id people's id
     * @return Person people
     */
    public Person getPerson(int id) {
        Person person = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            person = (Person) session.get(Person.class, id);
        } catch (HibernateException he) {
            log.error("Error getting person with id: " + id, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return person;
    }

    /**
     * Retrieve peoples by name
     *
     * @param name the name
     * @return Person peoples by last name
     */
    public List<Person> getPersonByName(String name) {
        List<Person> people = new ArrayList<Person>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Person.class);
            criteria.add(Restrictions.eq("name", name));
            people = criteria.list();
        } catch (HibernateException he) {
            log.error("Error getting all people with last name: " + name, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return people;
    }

    /**
     * save new person
     *
     * @param person person to insert
     * @return id of the inserted person
     */
    public int insert(Person person) {
        int id = 0;
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            id = (int) session.save(person);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of person: " + person, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    /**
     * save  person
     *
     * @param person person to update
     */
    public void update(Person person) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(person);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of person: " + person, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * remove person
     *
     * @param type the type
     * @param id   the id
     * @return the boolean
     */
    public boolean deleteById(Class<?> type, Serializable id) {
        Transaction transaction = null;
        Session session = null;
        boolean bool = false;

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Object persistentInstance = session.load(type, id);
            session.delete(persistentInstance);
            transaction.commit();
            bool = true;
        } catch (HibernateException he) {
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back delete of person: " + id, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return  bool;
    }
}
