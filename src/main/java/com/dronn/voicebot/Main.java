package com.dronn.voicebot;

import com.dronn.voicebot.service.Calculator;
import com.dronn.voicebot.service.CalculatorImpl;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	private final static Path JSON_PATH = Paths.get("src/main/resources/employees (2).json");
	private final static Path CSV_PATH = Paths.get("src/main/resources/employees (2).csv");

	public static void main(String[] args) throws FileNotFoundException {

		Calculator calculator = new CalculatorImpl();

		calculator.printSalariesFromJson(JSON_PATH);
		calculator.printSalariesFromCsv(CSV_PATH);

	}
}
