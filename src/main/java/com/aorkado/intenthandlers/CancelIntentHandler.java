package com.aorkado.intenthandlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;
import javax.inject.Singleton;

@Singleton
public class CancelIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.CancelIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    return input.getResponseBuilder()
        .withSpeech("Goodbye")
        .withSimpleCard("HelloWorld", "Goodbye")
        .withShouldEndSession(true)
        .build();
  }
}