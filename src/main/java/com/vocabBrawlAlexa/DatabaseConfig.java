package com.vocabBrawlAlexa;

import java.net.URL;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


@Configuration
@PropertySource({ "classpath:application.properties" })
@EnableJpaRepositories(
	    basePackages = "com.vocabBrawlAlexa.dao", 
	    entityManagerFactoryRef = "entityManagerFactory", 
	    transactionManagerRef = "transactionManager"
	)
//@EnableTransactionManagement
public class DatabaseConfig {
	
	private static final Logger LOGGER = LogManager.getLogger(DatabaseConfig.class.getName());
	
	// Private fields
	  
	  @Autowired
	  private Environment env;
	  
	  private DataSource dataSource;
	  
	  
	  public DatabaseConfig() {
	        super();
	    }
	  
	
		

	 
  /**
   * DataSource definition for database connection. Settings are read from
   * the application.properties file (using the env object).
   */
  @Primary
  @Bean
  public DataSource dataSource() {
	  
	  final Properties props = new Properties();
      props.put("driverClassName", env.getProperty("db.driver"));
      props.put("jdbcUrl", env.getProperty("db.url"));
      props.put("username", env.getProperty("db.username"));
      props.put("password", env.getProperty("db.password"));
      HikariConfig hc = new HikariConfig(props);
      HikariDataSource ds = new HikariDataSource(hc);
      ds.addDataSourceProperty("cachePrepStmts", true);
      ds.addDataSourceProperty("prepStmtCacheSize", 250);
      ds.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
      ds.addDataSourceProperty("useServerPrepStmts", true);
      ds.addDataSourceProperty("useLocalSessionState", true);
      ds.addDataSourceProperty("useLocalTransactionState", true);
      ds.addDataSourceProperty("rewriteBatchedStatements", true);
      ds.addDataSourceProperty("cacheResultSetMetadata", true);
      ds.addDataSourceProperty("cacheServerConfiguration", true);
      ds.addDataSourceProperty("elideSetAutoCommits", true);
      ds.addDataSourceProperty("maintainTimeStats", false);
      ds.setMaximumPoolSize(20);
      ds.setConnectionTimeout(60000);
      return ds;
      
  }

  /**
   * Declare the JPA entity manager factory.
   */
  @Primary
  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean entityManagerFactory =
        new LocalContainerEntityManagerFactoryBean();
    
    entityManagerFactory.setDataSource(dataSource());
    System.out.println(env.getProperty("entitymanager.packagesToScan"));
    
    // Classpath scanning of @Component, @Service, etc annotated class
    entityManagerFactory.setPackagesToScan(
        env.getProperty("entitymanager.packagesToScan"));
    
    // Vendor adapter
    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    vendorAdapter.setDatabase(Database.MYSQL);
    vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
    entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
    
    // Hibernate properties
    Properties additionalProperties = new Properties();
    additionalProperties.put(
        "hibernate.dialect", 
        env.getProperty("hibernate.dialect"));
    additionalProperties.put(
        "hibernate.show_sql", 
        env.getProperty("hibernate.show_sql"));
    additionalProperties.put(
            "hibernate.cache.use_second_level_cache", 
            env.getProperty("spring.jpa.properties.hibernate.cache.use_second_level_cache"));
    
    additionalProperties.put(
            "hibernate.cache.region.factory_class", 
            env.getProperty("spring.jpa.properties.hibernate.cache.region.factory_class"));
    
    additionalProperties.put(
            "hibernate.generate_statistics", 
            env.getProperty("spring.jpa.properties.hibernate.generate_statistics"));
    
   /* additionalProperties.put("hibernate.connection.provider_class",
    		"com.zaxxer.hikari.hibernate.HikariConnectionProvider");*/
    /*additionalProperties.put(
        "hibernate.hbm2ddl.auto", 
        env.getProperty("hibernate.hbm2ddl.auto"));*/
    entityManagerFactory.setJpaProperties(additionalProperties);
    
    return entityManagerFactory;
  }

  /**
   * Declare the transaction manager.
   */
  @Primary
  @Bean
  public PlatformTransactionManager transactionManager() {
    JpaTransactionManager transactionManager = 
        new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(
        entityManagerFactory().getObject());
    return transactionManager;
  }
  
  /**
   * PersistenceExceptionTranslationPostProcessor is a bean post processor
   * which adds an advisor to any bean annotated with Repository so that any
   * platform-specific exceptions are caught and then rethrown as one
   * Spring's unchecked data access exceptions (i.e. a subclass of 
   * DataAccessException).
   */
/*  @Primary
  @Bean
  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    return new PersistenceExceptionTranslationPostProcessor();
  }*/

  

}


