package com.aorkado.intenthandlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;
import javax.inject.Singleton;

@Singleton
public class HelpIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.HelpIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "You can say hello to me!";
    return input.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("HelloWorld", speechText)
        .withReprompt(speechText)
        .build();
  }
}