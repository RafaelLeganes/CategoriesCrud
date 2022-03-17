package com.sinensia.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity()
@Table(name = "categories")
@DynamicUpdate
public class Categories implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "categoryId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;

	@Column(name = "categoryName")
	private String categoryName;
	
	@OneToMany(mappedBy="categories", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Products> products;

	public Categories(String categoryName, List<Products> products) {
		this.categoryName = categoryName;
		this.products = products;
	}

	public Categories() {
		super();
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
}
