package com.dronn.voicebot.service.calculator;

import com.dronn.voicebot.bindings.annotations.CsvPrinter;
import com.dronn.voicebot.bindings.annotations.JsonPrinter;
import com.google.inject.Inject;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class SalaryPrinterImpl implements SalaryPrinter {

	private final SalaryPrinter jsonPrinter;
	private final SalaryPrinter csvPrinter;
	private Map<String, SalaryPrinter> printers = new HashMap<>();

	@Inject
	public SalaryPrinterImpl(@JsonPrinter SalaryPrinter jsonPrinter, @CsvPrinter SalaryPrinter csvPrinter) {
		this.jsonPrinter = jsonPrinter;
		this.csvPrinter = csvPrinter;
		this.printers.put("jsonPrinter", jsonPrinter);
		this.printers.put("csvPrinter", csvPrinter);
	}

	@Override
	public void printSalaries(Path path) {
		String fileName = path.getFileName().toString();
		Pattern jsonPattern = Pattern.compile("([a-zA-Z0-9\\s_\\\\.\\-():])+(\\.json)$");
		Pattern csvPattern = Pattern.compile("([a-zA-Z0-9\\s_\\\\.\\-():])+(\\.csv)$");
		if (jsonPattern.matcher(fileName).matches()) {
			printers.get("jsonPrinter").printSalaries(path);
		} else if (csvPattern.matcher(fileName).matches()) {
			printers.get("csvPrinter").printSalaries(path);
		}
	}

	public void addPrinter(String printerName, SalaryPrinter printer) {
		this.printers.put(printerName, printer);
	}

	public void removeReader(String printerName) {
		this.printers.remove(printerName);
	}
}
