package com.dronn.voicebot.service;

import java.nio.file.Path;

public interface Calculator {

	void printSalariesFromJson(Path path);

	void printSalariesFromCsv(Path path);
}
