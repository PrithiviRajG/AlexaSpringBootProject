/**
 * 
 */
package com.vocabBrawlAlexa.business.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;
import com.vocabBrawlAlexa.business.IAlexaBusiness;
import com.vocabBrawlAlexa.dao.IQuestionsDao;
import com.vocabBrawlAlexa.dao.JdbcDao;
import com.vocabBrawlAlexa.dto.QuestionTO;

import entity.SQuestion;

/**
 * @author Prithivi
 *
 */
@Component
@Service("AlexaBusinessImpl")
public class AlexaBusinessImpl implements IAlexaBusiness  {
	
	static final Logger log = Logger.getLogger(AlexaBusinessImpl.class);
	
	
	
	private final IQuestionsDao questionDao;
	
	@Autowired
	public AlexaBusinessImpl(IQuestionsDao questionDao) {
		this.questionDao=questionDao;
	}

	@Override
	public SpeechletResponse getHelloIntentResponse() {
		
		log.info("retrieve question");
		// TODO Auto-generated method stub
		
		
		QuestionTO ques=questionDao.findQuestionByQId(147, 2867);
		//String qText=jdbcDao.getQuestion(2867);
		//String speechText = qText;
		String speechText = ques.getMainQuestionTxt();
		log.info("speechText "+ speechText);

        // Create the Simple card content.
        SimpleCard card = getSimpleCard("Question 2867", speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = getPlainTextOutputSpeech(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
		
	}
	
	/**
     * Helper method that creates a card object.
     * @param title title of the card
     * @param content body of the card
     * @return SimpleCard the display card to be sent along with the voice response.
     */
    private SimpleCard getSimpleCard(String title, String content) {
        SimpleCard card = new SimpleCard();
        card.setTitle(title);
        card.setContent(content);

        return card;
    }
    
    /**
     * Helper method for retrieving an OutputSpeech object when given a string of TTS.
     * @param speechText the text that should be spoken out to the user.
     * @return an instance of SpeechOutput.
     */
    private PlainTextOutputSpeech getPlainTextOutputSpeech(String speechText) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return speech;
    }

	
}
