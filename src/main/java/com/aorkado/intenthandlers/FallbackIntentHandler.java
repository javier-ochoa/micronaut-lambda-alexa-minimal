package com.aorkado.intenthandlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;
import javax.inject.Singleton;

@Singleton
public class FallbackIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.FallbackIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Sorry, I don't know that. You can say try saying help!";
    return input.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("Fallback now!", speechText)
        .withReprompt(speechText)
        .build();
  }
}