package com.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
import com.backend.dao.ProductDao;
import com.backend.dao.UserDaoImpl;
import com.backend.dao.UsersDao;
import com.backend.model.Product;
import com.backend.model.Users;

public class App 
{
    public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//annotationConfigApplicationContext.refresh();
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
Users user=new Users();
user.setUsername("Diwa");
user.setPassword("DIWA");
userDao.registerUser(user);
          
ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
Product product=new Product();
product.setPname("MOBILE");
product.setPrice(9000.0f);
p.addProduct(product);
}

}
