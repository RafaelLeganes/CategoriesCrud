package com.sinensia.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sinensia.entities.Categories;


@Repository
public class CategoriesDao implements CategoriesIDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Categories category) {
        sessionFactory.getCurrentSession().save(category);
    }
}
