package vn.codegym.model.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import vn.codegym.model.bean.ConnectionUtil;
import vn.codegym.model.bean.Customer;

import javax.persistence.TypedQuery;
import java.util.List;

public class HibernateCustomerServiceImpl implements CustomerService  {
    @Override
    public List<Customer> findAll() {
        String queryStr = "SELECT c FROM Customer AS c";
        TypedQuery<Customer> query = ConnectionUtil.entityManager.createQuery(queryStr, Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer customer) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(customer);
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public void update(long id, Customer customer) {

    }

    @Override
    public void remove(long id) {

    }

}
