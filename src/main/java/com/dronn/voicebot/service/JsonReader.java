package com.dronn.voicebot.service;

import com.dronn.voicebot.model.Employee;

import java.nio.file.Path;
import java.util.List;

public interface JsonReader {
	List<Employee> mapFile(Path path);
}
