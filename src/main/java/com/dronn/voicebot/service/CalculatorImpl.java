package com.dronn.voicebot.service;

import com.dronn.voicebot.model.Employee;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculatorImpl implements Calculator {
	private JsonReader jsonReader = new JsonReaderImpl();
	private CsvReader csvReader = new CsvReaderImpl();

	private Map<String, BigDecimal> calculateSalaries(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.toMap(Employee::getJob, employee -> {
					if (employee.getSalary() == null) {
						return BigDecimal.valueOf(0);
					} else {
						return employee.getSalary();
					}
				}, BigDecimal::add));
	}

	@Override
	public void printSalariesFromJson(Path path) {
		calculateSalaries(jsonReader.mapFile(path))
				.forEach((job, salarySum) -> System.out.printf("%s: %.2f%n", job, salarySum));
	}

	@Override
	public void printSalariesFromCsv(Path path) {
		calculateSalaries(csvReader.mapFile(path))
				.forEach((job, salarySum) -> System.out.printf("%s: %.2f%n", job, salarySum));
	}
}
