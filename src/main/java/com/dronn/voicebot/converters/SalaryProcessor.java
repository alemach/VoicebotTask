package com.dronn.voicebot.converters;

import com.dronn.voicebot.service.UserFeedback;
import com.dronn.voicebot.service.UserFeedbackImpl;
import com.google.inject.Inject;
import com.opencsv.bean.processor.StringProcessor;

import java.math.BigDecimal;

public class SalaryProcessor implements StringProcessor {
	private final UserFeedback feedback;

	public SalaryProcessor() {
		this.feedback = UserFeedbackImpl.getInstance();
	}

	@Inject
	public SalaryProcessor(UserFeedback feedback) {
		this.feedback = feedback;
	}

	@Override
	public String processString(String input) {
		String value = input;
		if (input == null || input.trim().isEmpty()) {
			return null;
		}
		try {
			Double.valueOf(input);
		} catch (NumberFormatException e) {
			BigDecimal temp = feedback.getUserFeedback("not valid representation", input);
			if (temp == null) {
				value = null;
			} else {
				value = temp.toString();

			}
		}

		return value;
	}

	@Override
	public void setParameterString(String s) {

	}
}
