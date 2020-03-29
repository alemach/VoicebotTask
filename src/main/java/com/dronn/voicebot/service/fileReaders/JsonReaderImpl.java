package com.dronn.voicebot.service.fileReaders;

import com.dronn.voicebot.model.Employee;
import com.dronn.voicebot.model.Employees;
import com.dronn.voicebot.service.MappingExceptionHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class JsonReaderImpl implements FilesReader {
	private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	private DeserializationProblemHandler handler = new MappingExceptionHandler();


	@Override
	public List<Employee> mapFile(Path path) {
		List<Employee> employees = null;

		try {
			OBJECT_MAPPER.addHandler(handler);
			employees = Arrays.asList(OBJECT_MAPPER.readValue(path.toFile(), Employees.class).getEmployees());

		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}


}
