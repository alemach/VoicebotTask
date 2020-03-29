package com.dronn.voicebot.service.fileReaders;

import com.dronn.voicebot.model.Employee;

import java.nio.file.Path;
import java.util.List;

public interface FilesReader {
	List<Employee> mapFile(Path path);
}
