package com.dronn.voicebot.service;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

import java.io.IOException;

public class MappingExceptionHandler extends DeserializationProblemHandler {
	private UserFeedback feedback;

	public MappingExceptionHandler() {
		this.feedback = UserFeedbackImpl.getInstance();
	}

	@Override
	public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetType, String valueToConvert, String failureMsg) throws IOException {
		return feedback.getUserFeedback(failureMsg, valueToConvert);
	}

}
