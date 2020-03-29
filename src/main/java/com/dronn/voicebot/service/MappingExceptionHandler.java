package com.dronn.voicebot.service;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.google.inject.Inject;

import java.io.IOException;

public class MappingExceptionHandler extends DeserializationProblemHandler {
	private final UserFeedback feedback;

	@Inject
	public MappingExceptionHandler(UserFeedback feedback) {
		this.feedback = feedback;
	}

	@Override
	public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetType, String valueToConvert, String failureMsg) throws IOException {
		return feedback.getUserFeedback(failureMsg, valueToConvert);
	}

}
