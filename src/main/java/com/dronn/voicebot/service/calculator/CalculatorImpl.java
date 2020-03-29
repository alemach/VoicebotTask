package com.dronn.voicebot.service.calculator;

import com.dronn.voicebot.model.Employee;
import com.dronn.voicebot.service.fileReaders.FilesReader;
import com.google.inject.Inject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculatorImpl implements Calculator {
	private final FilesReader reader;

	@Inject
	public CalculatorImpl(@com.dronn.voicebot.bindings.annotations.FilesReader FilesReader reader) {
		this.reader = reader;
	}

	public Map<String, BigDecimal> calculateSalaries(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.toMap(Employee::getJob, employee -> {
					if (employee.getSalary() == null) {
						return BigDecimal.valueOf(0);
					} else {
						return employee.getSalary();
					}
				}, BigDecimal::add));
	}

}
