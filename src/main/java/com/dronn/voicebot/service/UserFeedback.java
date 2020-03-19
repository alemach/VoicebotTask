package com.dronn.voicebot.service;

import java.math.BigDecimal;

public interface UserFeedback {
	BigDecimal getUserFeedback(String failureMsg, String valueToConvert);
}
