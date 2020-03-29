package com.dronn.voicebot.service.calculator;

import com.dronn.voicebot.service.fileReaders.FilesReader;
import com.google.inject.Inject;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class SalaryPrinterImpl implements SalaryPrinter {

	private Map<String, SalaryPrinter> printers = new HashMap<>();
	private final FilesReader reader;
	private final Calculator calculator;

	@Inject
	public SalaryPrinterImpl(@com.dronn.voicebot.bindings.annotations.FilesReader FilesReader reader, Calculator calculator) {
		this.reader = reader;
		this.calculator = calculator;
		this.printers.put("jsonPrinter", new JsonSalaryPrinter(reader, calculator));
		this.printers.put("csvPrinter", new CsvSalaryPrinter(reader, calculator));
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
