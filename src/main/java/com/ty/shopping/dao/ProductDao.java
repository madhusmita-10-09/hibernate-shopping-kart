package com.ty.shopping.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;

public class ProductDao {
	//insert data in to the data base//
	public Product saveProduct(Product product)
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = enityManager.getTransaction();
		
		entityTransaction.begin();
		enityManager.persist(product);
		entityTransaction.commit();
		if (product != null) {
			return product;
		} else {
			return null;
		}

		
	}
	//get details by id//
	public Product getProductById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		Product product = enityManager.find(Product.class, id);

		if (product != null) {
			System.out.println("Id is:" + product.getId());
			System.out.println("Name is: " +product.getName());
			System.out.println("Brand is:" +product.getBrand());
			System.out.println("Cost  is " +product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			
			System.out.println("--------------------------");
		} else {
            return product;
		}
		return null;
	}
	//get all details//
	public List<Product>getAllProduct()
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String sql="SELECT p FROM Product p";
		Query query=entityManager.createQuery(sql);
		List<Product> products=query.getResultList();
		
		for(Product product:products)
		{
			System.out.println("Id is: "+product.getId());
			System.out.println("Name is: "+product.getName());
			System.out.println("Brand is :"+product.getBrand());
			System.out.println("Cost is :"+product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is :"+product.getSize());
			System.out.println("Ratings is :"+product.getRating());
			
			System.out.println("--------------------");
		}
		
		return null;
	}
	//validate  the product by name and brand//
	public Product validProduct(String name,String brand)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("SELECT p FROM Product p WHERE p.name= ?1 AND p.brand= ?2");
		
		
		
		query.setParameter(1,name);
		query.setParameter(2, brand);
		
		List<Product> products=query.getResultList();
		if(products.size()>0)
		{
			Product product=products.get(0);
			System.out.println("Id is:"+product.getId());
			System.out.println("Name is :"+product.getName());
			System.out.println("Brandis: "+product.getBrand());
			System.out.println("Cost is:"+product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			
			System.out.println("---------------------------");
		}
		else
		{
			System.out.println("invalid name and brand");
		}
		return null;
	}
	//delete product by id//
	public boolean deleteProductById(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Product product=enityManager.find(Product.class,id);
		if(product!=null)
		{
			entityTransaction.begin();
			enityManager.remove(product);
			entityTransaction.commit();
			System.out.println("deleting id is: "+id);
		}
		else
		{
			System.out.println("No record to deelect");
		}
		
		return false;
	}
	//get product detals by brand//
	public List<Product> getProductByBrand(String brand) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		
		String sql="Select p from Product p where p.brand=?1";
		Query query=enityManager.createQuery(sql);
		query.setParameter(1, brand);
		List<Product>products=query.getResultList();
			if (products.size()>0) {
			for(Product product:products)
			{
			System.out.println("Id is:" + product.getId());
			System.out.println("Name is: " +product.getName());
			System.out.println("Brand is:" +product.getBrand());
			System.out.println("Cost  is " +product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			
			System.out.println("-------------------------------------");
		} 
			
            
		}
			else {
				System.out.println("Enter valid brand");
			}
		return null;
	}
	
	//get details by type//
	public List<Product> getProductByType(String type) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		
		String sql="Select p from Product p where p.type=?1";
		Query query=enityManager.createQuery(sql);
		query.setParameter(1, type);
		List<Product>products=query.getResultList();
			if (products.size()>0) {
			for(Product product:products)
			{
			System.out.println("Id is:" + product.getId());
			System.out.println("Name is: " +product.getName());
			System.out.println("Brand is:" +product.getBrand());
			System.out.println("Cost  is " +product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			System.out.println("-----------------------------");
		} 
			
            
		}
			else {
				
			
				System.out.println("Enter valid type");
		    	}
		     return null;
		     
	}
	
	//get details by Cost//
	
	public List<Product> getProductByCost(double cost) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		
		String sql="Select p from Product p where p.cost=?1";
		Query query=enityManager.createQuery(sql);
		query.setParameter(1, cost);
		List<Product>products=query.getResultList();
			if (products.size()>0) {
			for(Product product:products)
			{
			System.out.println("Id is:" + product.getId());
			System.out.println("Name is: " +product.getName());
			System.out.println("Brand is:" +product.getBrand());
			System.out.println("Cost  is " +product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			
			System.out.println("------------------------------");
		} 
			
            
		}
			else {
				
			
				System.out.println("Enter valid Cost");
		    	}
		     return null;
		     
	}
	
	//get details by size//
	
	
	public List<Product> getProductBySize(String size) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		
		String sql="Select p from Product p where p.size=?1";
		Query query=enityManager.createQuery(sql);
		query.setParameter(1, size);
		List<Product>products=query.getResultList();
			if (products.size()>0) {
			for(Product product:products)
			{
			System.out.println("Id is:" + product.getId());
			System.out.println("Name is: " +product.getName());
			System.out.println("Brand is:" +product.getBrand());
			System.out.println("Cost  is " +product.getCost());
			System.out.println("Type is: "+product.getType());
			System.out.println("Size is: "+product.getSize());
			System.out.println("Ratings is: "+product.getRating());
			
			System.out.println("------------------------------");
		} 
			
            
		}
			else {
				
			
				System.out.println("Enter valid Size");
		    	}
		     return null;
		     
	}
	
	
	
	
	//update rating//
	public int updateRating(int id) {
		int count = 1;
		count++;
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			System.out.println("For the details provided the ID of your Product is" + id);
			System.out.println(product.getRating() + "your product present rating ");
			System.out.println("Enter your new rating");
		    int nrating = sc.nextInt();
			int temp = product.getRating();
			temp = (temp + nrating) / count;
			System.out.println("This is the updated rating: "+temp);
			product.setRating(temp);

			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			
			System.out.println("Rating Updated in Database!");
			return temp;
		}
		return 0;
	}
	}
	
	
	
	
	


	
	
	
	
	


