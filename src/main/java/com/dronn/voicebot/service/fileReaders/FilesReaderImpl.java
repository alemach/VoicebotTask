package com.dronn.voicebot.service.fileReaders;

import com.dronn.voicebot.bindings.annotations.CsvReader;
import com.dronn.voicebot.bindings.annotations.JsonReader;
import com.dronn.voicebot.model.Employee;
import com.google.inject.Inject;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class FilesReaderImpl implements FilesReader {

	private final FilesReader jsonReader;
	private final FilesReader csvReader;
	private Map<String, FilesReader> readers = new HashMap<>();

	@Inject
	public FilesReaderImpl(@JsonReader FilesReader jsonReader, @CsvReader FilesReader csvReader) {
		this.jsonReader = jsonReader;
		this.csvReader = csvReader;
		this.readers.putIfAbsent("jsonReader", jsonReader);
		this.readers.putIfAbsent("csvReader", csvReader);
	}

	@Override
	public List<Employee> mapFile(Path path) {
		String fileName = path.getFileName().toString();
		Pattern jsonPattern = Pattern.compile("([a-zA-Z0-9\\s_\\\\.\\-():])+(\\.json)$");
		Pattern csvPattern = Pattern.compile("([a-zA-Z0-9\\s_\\\\.\\-():])+(\\.csv)$");
		if (jsonPattern.matcher(fileName).matches()) {
			return readers.get("jsonReader").mapFile(path);
		} else if (csvPattern.matcher(fileName).matches()) {
			return readers.get("csvReader").mapFile(path);
		} else {
			return null;
		}
	}

	public void addReader(String readerName, FilesReader reader) {
		this.readers.put(readerName, reader);
	}

	public void removeReader(String readerName) {
		this.readers.remove(readerName);
	}
}
