package com.vocabBrawlAlexa;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.amazon.speech.Sdk;
import com.amazon.speech.speechlet.servlet.SpeechletServlet;




@SpringBootApplication
@ServletComponentScan
@ComponentScan("com.vocabBrawlAlexa")
public class VocabBrawlAlexaApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(VocabBrawlAlexaApplication.class.getName());
	
	
	
	public static void main(String[] args) {
		LOGGER.info("Info Message Logged !!!");
		 //setAmazonProperties();
		
		
        LOGGER.info("Info Message Logged asdfsa !!!");
		setAmazonProperties();
		 
		SpringApplication.run(VocabBrawlAlexaApplication.class, args);
		
	}
	
	/**
     * Sets system properties which are picked up by the {@link SpeechletServlet}.
     */
    private static void setAmazonProperties() {
        // Disable signature checks for development
    	LOGGER.info("Info Message Logged setAmazonProperties !!!");
        System.setProperty(Sdk.DISABLE_REQUEST_SIGNATURE_CHECK_SYSTEM_PROPERTY, "true");
        // Allow all application ids for development
        System.setProperty(Sdk.SUPPORTED_APPLICATION_IDS_SYSTEM_PROPERTY, "amzn1.ask.skill.1672b699-610a-42b6-83cb-0a4e7c9f5ccf");
        // Disable timestamp verification for development
        System.setProperty(Sdk.TIMESTAMP_TOLERANCE_SYSTEM_PROPERTY, "1500");
    }
    
    

    
    
   /* @Primary
    @Bean
    public ServletRegistrationBean registerServlet(VocabBrawlSpeechlet mySpeechlet) {
    	
    	LOGGER.info("Alexa configuration");

        SpeechletServlet speechletServlet = new SpeechletServlet();
        speechletServlet.setSpeechlet(mySpeechlet);

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(speechletServlet,"/hello");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("alexa");
        servletRegistrationBean.addUrlMappings("/alexa/*");
        servletRegistrationBean.addUrlMappings("/alexa/hello/*");
        servletRegistrationBean.addUrlMappings("/hello/*");
        servletRegistrationBean.addUrlMappings("/hello");
        servletRegistrationBean.addUrlMappings("/*");
        return servletRegistrationBean;     
    }*/
	
    

    
    
}
