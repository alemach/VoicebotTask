package com.dronn.voicebot.service;

import com.dronn.voicebot.model.Employee;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvReaderImpl implements CsvReader {

	@Override
	public List<Employee> mapFile(Path path) {
		List<Employee> employees = null;
		try (Reader reader = Files.newBufferedReader(path)) {
			CsvToBean csvToBean = new CsvToBeanBuilder<>(reader)
					.withIgnoreEmptyLine(true)
					.withIgnoreLeadingWhiteSpace(true)
					.withFieldAsNull(CSVReaderNullFieldIndicator.NEITHER)
					.withSeparator(';')
					.withQuoteChar('"')
					.withType(Employee.class)
					.build();
			employees = csvToBean.parse();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return employees;
	}
}
