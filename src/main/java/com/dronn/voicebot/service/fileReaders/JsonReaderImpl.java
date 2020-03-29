package com.dronn.voicebot.service.fileReaders;

import com.dronn.voicebot.model.Employee;
import com.dronn.voicebot.model.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.google.inject.Inject;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class JsonReaderImpl implements FilesReader {
	private final ObjectMapper OBJECT_MAPPER;
	private final DeserializationProblemHandler handler;

	@Inject
	public JsonReaderImpl(DeserializationProblemHandler handler, ObjectMapper mapper) {
		this.OBJECT_MAPPER = mapper;
		this.handler = handler;
	}


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
