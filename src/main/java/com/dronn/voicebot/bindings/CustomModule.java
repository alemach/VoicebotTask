package com.dronn.voicebot.bindings;

import com.dronn.voicebot.service.calculator.Calculator;
import com.dronn.voicebot.service.calculator.CalculatorImpl;
import com.dronn.voicebot.service.UserFeedback;
import com.dronn.voicebot.service.UserFeedbackImpl;
import com.dronn.voicebot.service.calculator.CsvSalaryPrinter;
import com.dronn.voicebot.service.calculator.JsonSalaryPrinter;
import com.dronn.voicebot.service.calculator.SalaryPrinter;
import com.dronn.voicebot.service.calculator.SalaryPrinterImpl;
import com.dronn.voicebot.service.fileReaders.CsvReaderImpl;
import com.dronn.voicebot.service.fileReaders.FilesReader;
import com.dronn.voicebot.service.fileReaders.FilesReaderImpl;
import com.dronn.voicebot.service.fileReaders.JsonReaderImpl;
import com.google.inject.AbstractModule;

public class CustomModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(FilesReader.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.FilesReader.class)
				.to(FilesReaderImpl.class);
		bind(FilesReader.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.JsonReader.class)
				.to(JsonReaderImpl.class);
		bind(FilesReader.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.CsvReader.class)
				.to(CsvReaderImpl.class);
		bind(Calculator.class).to(CalculatorImpl.class);
		bind(UserFeedback.class).to(UserFeedbackImpl.class).asEagerSingleton();
		bind(SalaryPrinter.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.SalaryPrinter.class)
				.to(SalaryPrinterImpl.class);
		bind(SalaryPrinter.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.JsonPrinter.class)
				.to(JsonSalaryPrinter.class);
		bind(SalaryPrinter.class)
				.annotatedWith(com.dronn.voicebot.bindings.annotations.CsvPrinter.class)
				.to(CsvSalaryPrinter.class);
	}
}
