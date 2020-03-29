package com.dronn.voicebot.converters;

import com.dronn.voicebot.service.UserFeedback;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SalaryProcessorTest {

//	private UserFeedback feedback;
//	private SalaryProcessor processor;
//
//	@Before
//	public void setUp() {
//		feedback = mock(UserFeedback.class);
//		processor = new SalaryProcessor(feedback);
//	}
//
//	@Test
//	public void processEmptyStringShouldReturnNull() {
//		//given
//		String input = "";
//		//when
//		String result = processor.processString(input);
//		//than
//		assertNull(result);
//	}
//
//	@Test
//	public void processNullStringShouldReturnNull() {
//
//		//given
//		String input = null;
//		//when
//		String result = processor.processString(input);
//		//than
//		assertNull(result);
//	}
//
//	@Test
//	public void processCorrectStringShouldReturnInput() {
//
//		//given
//		String input = "123.123";
//		//when
//		String result = processor.processString(input);
//		//than
//		assertEquals(input, result);
//	}
//
//	@Test
//	public void processIncorrectStringShouldReturnValidString() {
//		//given
//		String input = "123,123";
//		when(feedback.getUserFeedback("not valid representation", input)).thenReturn(BigDecimal.valueOf(123.123));
//		//when
//		String result = processor.processString(input);
//		//than
//		assertEquals("123.123", result);
//	}
//
//	@Test
//	public void processIncorrectStringShouldReturnNull() {
//		//given
//		String input = "123,123";
//		when(feedback.getUserFeedback("not valid representation", input)).thenReturn(null);
//		//when
//		String result = processor.processString(input);
//		//than
//		assertEquals(null, result);
//		assertNull(result);
//	}
}