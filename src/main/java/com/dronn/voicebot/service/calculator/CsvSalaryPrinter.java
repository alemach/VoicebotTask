package com.dronn.voicebot.service.calculator;

import com.dronn.voicebot.service.fileReaders.FilesReader;
import com.google.inject.Inject;

import java.nio.file.Path;

public class CsvSalaryPrinter implements SalaryPrinter {
	private final FilesReader reader;
	private final Calculator calculator;

	@Inject
	public CsvSalaryPrinter(@com.dronn.voicebot.bindings.annotations.FilesReader FilesReader reader, Calculator calculator) {
		this.reader = reader;
		this.calculator = calculator;
	}

	@Override
	public void printSalaries(Path path) {
		calculator.calculateSalaries(reader.mapFile(path))
				.forEach((job, salarySum) -> System.out.printf("%s: %.2f%n", job, salarySum));
	}
}
