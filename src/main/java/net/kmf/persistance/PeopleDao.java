package net.kmf.persistance;

import net.kmf.entity.People;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class PeopleDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Return a list of all peoples
     *
     * @return All peoples
     */
    public List<People> getAllPeoples() {
        List<People> peoples = new ArrayList<People>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            peoples = session.createCriteria(People.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all peoples", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return peoples;
    }

    /**
     * Get a single people for the given id
     *
     * @param id people's id
     * @return People people
     */
    public People getPeople(int id) {
        People people = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            people = (People) session.get(People.class, id);
        } catch (HibernateException he) {
            log.error("Error getting people with id: " + id, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return people;
    }

    /**
     * Retrieve peoples by lastname
     *
     * @param lastName People's last name which is the search criteria
     * @return People peoples by last name
     */
    public List<People> getPeoplesByLastName(String lastName) {
        List<People> peoples = new ArrayList<People>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(People.class);
            criteria.add(Restrictions.eq("lastName", lastName));
            peoples = criteria.list();
        } catch (HibernateException he) {
            log.error("Error getting all peoples with last name: " + lastName, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return peoples;
    }

    /**
     * save new people
     *
     * @param people people to insert
     * @return id of the inserted people
     */
    public int insert(People people) {
        int id = 0;
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(people);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of people: " + people, he2);
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
     * save  people
     *
     * @param people people to update
     */
    public void update(People people) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(people);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of people: " + people, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     *  remove people
     *
     *  @param people people to delete
     */
    public void delete(People people) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(people);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back delete of people: " + people, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
