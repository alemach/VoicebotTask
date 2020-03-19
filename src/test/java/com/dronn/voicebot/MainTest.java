package com.dronn.voicebot;

import com.dronn.voicebot.converters.SalaryProcessorTest;
import com.dronn.voicebot.service.CalculatorTest;
import com.dronn.voicebot.service.CsvReaderTest;
import com.dronn.voicebot.service.JsonReaderTest;
import com.dronn.voicebot.service.UserFeedbackTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SalaryProcessorTest.class, CalculatorTest.class, CsvReaderTest.class, JsonReaderTest.class, UserFeedbackTest.class})
public class MainTest {

}