package com.codegym.service;

import com.codegym.model.ImageComment;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

public class ImageServiceImpl implements ImageService{
    private static EntityManager entityManager;
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<ImageComment> findAll() {
        String queryStr = "SELECT c FROM ImageComment AS c";
        TypedQuery<ImageComment> query = entityManager.createQuery(queryStr, ImageComment.class);
        return query.getResultList();
    }
    @Override
    public List<ImageComment> findAll(List<Long> ids) {
        return Collections.emptyList();
    }

}
