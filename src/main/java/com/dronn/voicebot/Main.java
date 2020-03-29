package com.dronn.voicebot;

import com.dronn.voicebot.bindings.CustomModule;
import com.dronn.voicebot.service.calculator.Calculator;
import com.dronn.voicebot.service.calculator.SalaryPrinter;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	private final static Path JSON_PATH = Paths.get("src/main/resources/employees (2).json");
	private final static Path CSV_PATH = Paths.get("src/main/resources/employees (2).csv");

	public static void main(String[] args) throws FileNotFoundException {

		Injector injector = Guice.createInjector(new CustomModule());
		SalaryPrinter printer = injector.getInstance(Key.get(SalaryPrinter.class, com.dronn.voicebot.bindings.annotations.SalaryPrinter.class));
		printer.printSalaries(JSON_PATH);
		printer.printSalaries(CSV_PATH);

	}
}
