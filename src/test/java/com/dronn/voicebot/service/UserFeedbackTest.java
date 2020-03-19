package com.dronn.voicebot.service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class UserFeedbackTest {

	@Rule
	public final TextFromStandardInputStream inputStream = emptyStandardInputStream();
	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();
	private UserFeedback feedback;

	@Before
	public void setUp() {
		feedback = UserFeedbackImpl.getInstance();
	}

	@Test
	public void getUserFeedbackIgnoreShouldReturnNull() {

		//given
		inputStream.provideLines("ignore");
		String errorMsg = "error";
		String value = "123,123";

		//when
		BigDecimal result = feedback.getUserFeedback(errorMsg, value);

		//than
		assertNull(result);
	}

	@Test
	public void getUserFeedbackCorrectShouldReturnValue() {

		//given
		String correctedValue = "123.123";
		inputStream.provideLines("correct", correctedValue);
		String errorMsg = "error";
		String value = "123,123";

		//when
		BigDecimal result = feedback.getUserFeedback(errorMsg, value);

		//than
		assertEquals(new BigDecimal(correctedValue), result);
	}

	@Test
	public void getUserFeedbackAbortShouldSystemExitReturnValue1() {

		//given
		inputStream.provideLines("abort");
		String errorMsg = "error";
		String value = "abort";
		exit.expectSystemExitWithStatus(1);
		//when
		feedback.getUserFeedback(errorMsg, value);

		//than
	}
}