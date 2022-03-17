package com.sinensia.dao;

import org.springframework.stereotype.Repository;

import com.sinensia.entities.Categories;


@Repository
public interface CategoriesIDao {
	
	void add(Categories category);

}
