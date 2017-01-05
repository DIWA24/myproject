package com.backend.configuration;

<<<<<<< HEAD

=======
>>>>>>> initial commit backend
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

<<<<<<< HEAD
import com.backend.model.Users;
=======
import com.backend.model.Student;
>>>>>>> initial commit backend


@Configuration
@EnableTransactionManagement
@ComponentScan("com")
public class ApplicationConfig {
	
	@Autowired
	@Bean(name="datasource")
	public DataSource getDataSource()
	{
		System.out.println("I am inside the datasource");
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setUsername("sa");
		driverManagerDataSource.setPassword("sa");
		driverManagerDataSource.setDriverClassName("org.h2.Driver");
<<<<<<< HEAD
		driverManagerDataSource.setUrl("jdbc:h2:tcp://localhost/~/project1");
=======
		driverManagerDataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
>>>>>>> initial commit backend
		return driverManagerDataSource;
	}
	private Properties getProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		return properties;
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		 LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(dataSource);
		 localSessionFactoryBuilder.addProperties(getProperties());
<<<<<<< HEAD
		localSessionFactoryBuilder.addAnnotatedClasses(Users.class);
=======
		localSessionFactoryBuilder.addAnnotatedClasses(Student.class);
>>>>>>> initial commit backend
		 return localSessionFactoryBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;
		
	}

}
