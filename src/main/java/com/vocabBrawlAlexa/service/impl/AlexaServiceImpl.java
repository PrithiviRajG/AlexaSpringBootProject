/**
 * 
 */
package com.vocabBrawlAlexa.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.speech.speechlet.SpeechletResponse;
import com.vocabBrawlAlexa.business.IAlexaBusiness;
import com.vocabBrawlAlexa.business.impl.AlexaBusinessImpl;
import com.vocabBrawlAlexa.service.IAlexaService;

/**
 * @author Prithivi
 *
 */
@Component
@Service("AlexaServiceImpl")
public class AlexaServiceImpl implements IAlexaService {
	
	static final Logger log = Logger.getLogger(AlexaServiceImpl.class);
	
	
	private final IAlexaBusiness alexaBusiness;
	
	@Autowired
	public AlexaServiceImpl(IAlexaBusiness alexaBusiness) {
		this.alexaBusiness=alexaBusiness;
	}

	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public SpeechletResponse getHelloIntentResponse() {
		// TODO Auto-generated method stub
		log.info("Alexa service");
		//IAlexaBusiness alexaBus = new AlexaBusinessImpl();
		return alexaBusiness.getHelloIntentResponse();
	}

}
