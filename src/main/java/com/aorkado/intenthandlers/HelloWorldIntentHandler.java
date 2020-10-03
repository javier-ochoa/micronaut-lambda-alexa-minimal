package com.aorkado.intenthandlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;
import javax.inject.Singleton;

@Singleton
public class HelloWorldIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("HelloWorldIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Hello World to you too!";
    return input.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("HelloWorld", speechText)
        .withShouldEndSession(true)
        .build();
  }
}