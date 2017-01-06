package com.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.backend.model.Employ;

@Configuration
@Component("com")
public class ApplicationConfig {
	
	@Autowired
	@Bean(name="datasource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setUsername("system");
		driverManagerDataSource.setPassword("system");
		driverManagerDataSource.setDriverClassName("org.h2.Driver");
		driverManagerDataSource.setUrl("jdbc:h2:tcp://localhost/~/project1");
		return driverManagerDataSource;
	}
	private Properties getProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty(	"hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		return properties;
	}
	@Autowired
	@Bean(name="sessionFactory")
 public SessionFactory getSessionFactory(DataSource dataSource)	{
	LocalSessionFactoryBuilder localsessionfactorybuilder= new LocalSessionFactoryBuilder(dataSource);
	localsessionfactorybuilder.addProperties(getProperties());
	localsessionfactorybuilder.addAnnotatedClasses(Employ.class);
	return localsessionfactorybuilder.buildSessionFactory();	
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;
		
	}

	

}
