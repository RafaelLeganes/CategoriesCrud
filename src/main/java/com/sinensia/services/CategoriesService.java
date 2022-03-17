package com.sinensia.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.dao.CategoriesIDao;
import com.sinensia.entities.Categories;


@Service
public class CategoriesService implements CategoriesIService{

    @Autowired
    public CategoriesIDao Categories;

    @Transactional
    @Override
    public void add(Categories category) {
    	Categories.add(category);
    }

}
