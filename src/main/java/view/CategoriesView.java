package view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sinensia.configs.AppConfig;
import com.sinensia.entities.Categories;
import com.sinensia.entities.Products;
import com.sinensia.services.CategoriesIService;

public class CategoriesView {

	public static void main(String[] args) {
	    System.out.println("This is the start of the PT Spring Hibernate application");
	    AnnotationConfigApplicationContext context =
	            new AnnotationConfigApplicationContext(AppConfig.class);

	    CategoriesIService categoryIService = context.getBean(CategoriesIService.class);
	    
	    Categories category1 = new Categories();
	    category1.setCategoryName("categoryCrud");
		List<Products> listaProductosCrud = new ArrayList<Products>();
		Products product = new Products();
		product.setProductName("ProductCrud");
		product.setCategories(category1);
		listaProductosCrud.add(product);
		category1.setProducts(listaProductosCrud);
	    
	    categoryIService.add(category1);

	    context.close();

	}

}
