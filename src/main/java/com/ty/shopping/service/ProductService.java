package com.ty.shopping.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;

public class ProductService {

	
    //insert product//
	public Product saveProduct(Product product) {
		ProductDao productDao = new ProductDao();
		product.setName("ladies kurti");
		product.setBrand("Rangriti");
		product.setCost(1299);
		product.setType("Round Neck,V-Neck,Band,Straight,Flat Collar");
		product.setSize("L");
		product.setRating(5);

		return productDao.saveProduct(product);
	}
     //get details by id//
	public Product getProductById(int id) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductById(id);
	}
    //get all details//
	public List<Product> getAllProduct() {
		ProductDao productDao = new ProductDao();
		return productDao.getAllProduct();
	}
    //valid the product//
	public Product validProduct(String name, String brand) {
		ProductDao productDao = new ProductDao();
		return productDao.validProduct(name, brand);
	}
    //delete product by id//
	public boolean deleteProductById(int id) {
		ProductDao productDao = new ProductDao();
		return productDao.deleteProductById(id);
	}
    //get all details by brand//
	public List<Product> getProductByBrand(String brand) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductByBrand(brand);
	}
	//get all details by Type//
	public List<Product> getProductByType(String type) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductByType(type);
	}
	//get all details by Cost//
	public List<Product> getProductByCost(double cost) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductByCost(cost);
	}
	//get all details by size//
	
	public List<Product> getProductBySize(String size) {
		ProductDao productDao = new ProductDao();
		return productDao.getProductBySize(size);
	}
	
	
    //update rating//
	public void updateRating(String name, String brand, String type) {
		ProductDao productDao = new ProductDao();
		int id = 0;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT product FROM Product product WHERE product.name=?1 AND product.brand=?2 AND product.type=?3";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, brand);
		query.setParameter(3, type);

		List<Product> products = query.getResultList();
		if (products.size() > 0) {
			for (Product product : products) {
				id = product.getId();
			}
		}
		productDao.updateRating(id);

	}

}
