package vn.codegym.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import vn.codegym.hibernate.ConnectionUtil;
import vn.codegym.model.Picture;

public class PictureServiceImpl implements PictureService {
    @Override
    public void saveComment(Picture picture) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(picture);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
