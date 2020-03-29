package com.dronn.voicebot.service.calculator;

import com.dronn.voicebot.model.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface Calculator {

	Map<String, BigDecimal> calculateSalaries(List<Employee> employees);

}
