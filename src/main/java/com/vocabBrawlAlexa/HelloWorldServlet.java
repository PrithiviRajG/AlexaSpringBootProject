package com.vocabBrawlAlexa;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;
import com.vocabBrawlAlexa.controller.VocabBrawlSpeechlet;

@WebServlet("/hello")
public class HelloWorldServlet extends SpeechletServlet {
	
	private static final Logger LOGGER = LogManager.getLogger(HelloWorldServlet.class.getName());

  /**
	 * 
	 */
	private static final long serialVersionUID = -8294485619021129263L;
	
	
	private VocabBrawlSpeechlet vocabBrawlSpeechlet;
	
	@Autowired
    public HelloWorldServlet(VocabBrawlSpeechlet vocabBrawlSpeechlet) {
		LOGGER.debug("Autowiring vocabBrawlSpeechlet");
        this.vocabBrawlSpeechlet = vocabBrawlSpeechlet;
        this.setSpeechlet(this.vocabBrawlSpeechlet);
        
    }
	
}
