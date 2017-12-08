package com.vocabBrawlAlexa.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.ui.OutputSpeech;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;
import com.vocabBrawlAlexa.service.IAlexaService;



@Component
public class VocabBrawlSpeechlet  implements SpeechletV2 {
	
	
	
	
	static final Logger log = Logger.getLogger(VocabBrawlSpeechlet.class);
	
	
	 private IAlexaService alexaService;

	    /**
	     * Constructor.
	     *
	     * @param alexaService service.
	     */
	    @Autowired
	    public VocabBrawlSpeechlet(IAlexaService alexaService) {
	        this.alexaService = alexaService;
	    }
	    
	

	public VocabBrawlSpeechlet() {
			// TODO Auto-generated constructor stub
		}



	@Override
	public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> requestEnvelope) {
		log.info("onSessionStarted " );
		log.info("Request requestId "+requestEnvelope.getRequest().getRequestId()
				+" session Id "+requestEnvelope.getSession().getSessionId()+
				" user ID "+requestEnvelope.getSession().getUser().getUserId());		
        // any initialization logic goes here
    }

	@Override
    public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> requestEnvelope) {
    	log.info("onLaunch");
    	log.info("Request requestId "+requestEnvelope.getRequest().getRequestId()
				+" session Id "+requestEnvelope.getSession().getSessionId()+
				" user ID "+requestEnvelope.getSession().getUser().getUserId());
        return getWelcomeResponse();
    }

	@Override
    public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
        IntentRequest request = requestEnvelope.getRequest();
        log.debug("reached Intent");
        log.info("onIntent");
        log.info("Request requestId "+requestEnvelope.getRequest().getRequestId()
				+" session Id "+requestEnvelope.getSession().getSessionId()+
				" user ID "+requestEnvelope.getSession().getUser().getUserId());

        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        if ("HelloWorldIntent".equals(intentName)) {
        	log.debug("HelloWorldIntent Intent");
        	log.debug(alexaService);
        	//IAlexaService alexa = new AlexaServiceImpl();
            return alexaService.getHelloIntentResponse();
        } else if ("AMAZON.HelpIntent".equals(intentName)) {
            return getHelpResponse();
        } else {
            return getAskResponse("HelloWorld", "This is unsupported.  Please try something else.");
        }
    }

	@Override
    public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
    	log.info("onSessionEnded");
    	log.info("Request requestId "+requestEnvelope.getRequest().getRequestId()
				+" session Id "+requestEnvelope.getSession().getSessionId()+
				" user ID "+requestEnvelope.getSession().getUser().getUserId());
        // any cleanup logic goes here
    }

    /**
     * Creates and returns a {@code SpeechletResponse} with a welcome message.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getWelcomeResponse() {
        String speechText = "Welcome to the Alexa Skills Kit, you can say hello";
        return getAskResponse("HelloWorld", speechText);
    }

    /**
     * Creates a {@code SpeechletResponse} for the hello intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getHelloResponse() {
    	log.debug("reached hello world");
        String speechText = "Hello world";

        // Create the Simple card content.
        SimpleCard card = getSimpleCard("HelloWorld", speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = getPlainTextOutputSpeech(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the help intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getHelpResponse() {
        String speechText = "You can say hello to me!";
        return getAskResponse("HelloWorld", speechText);
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

    /**
     * Helper method that returns a reprompt object. This is used in Ask responses where you want
     * the user to be able to respond to your speech.
     * @param outputSpeech The OutputSpeech object that will be said once and repeated if necessary.
     * @return Reprompt instance.
     */
    private Reprompt getReprompt(OutputSpeech outputSpeech) {
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(outputSpeech);

        return reprompt;
    }

    /**
     * Helper method for retrieving an Ask response with a simple card and reprompt included.
     * @param cardTitle Title of the card that you want displayed.
     * @param speechText speech text that will be spoken to the user.
     * @return the resulting card and speech text.
     */
    private SpeechletResponse getAskResponse(String cardTitle, String speechText) {
        SimpleCard card = getSimpleCard(cardTitle, speechText);
        PlainTextOutputSpeech speech = getPlainTextOutputSpeech(speechText);
        Reprompt reprompt = getReprompt(speech);

        return SpeechletResponse.newAskResponse(speech, reprompt, card);
    }

	

}
