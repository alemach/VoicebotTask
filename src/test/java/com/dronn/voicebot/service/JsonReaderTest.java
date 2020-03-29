package com.dronn.voicebot.service;

import com.dronn.voicebot.model.Employee;
import com.dronn.voicebot.service.fileReaders.JsonReaderImpl;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JsonReaderTest {
//	private Path pathOk;
//	private Path pathWithNullFields;
//	private JsonReader reader;
//
//	@Before
//	public void setUp() throws Exception {
//		reader = new JsonReaderImpl(handler);
//		pathOk = Paths.get("src/test/resources/test.json");
//		pathWithNullFields = Paths.get("src/test/resources/testNullValue.json");
//	}
//
//	@Test
//	public void mapFile() {
//
//		//when
//		List<Employee> result = reader.mapFile(pathOk);
//		//than
//		assertEquals(2, result.size());
//		assertEquals(1, result.get(0).getId());
//		assertEquals("John", result.get(0).getName());
//		assertEquals("Doe", result.get(0).getSurname());
//		assertEquals("Teacher", result.get(0).getJob());
//		assertEquals(new BigDecimal("12"), result.get(0).getSalary());
//		assertEquals(2, result.get(1).getId());
//		assertEquals("Jane", result.get(1).getName());
//		assertEquals("Doe", result.get(1).getSurname());
//		assertEquals("Janitor", result.get(1).getJob());
//		assertEquals(new BigDecimal("13"), result.get(1).getSalary());
//	}
//
//	@Test
//	public void whenNullFieldsMapFile() {
//
//		//when
//		List<Employee> result = reader.mapFile(pathWithNullFields);
//		//than
//		assertEquals(2, result.size());
//		assertEquals(0, result.get(0).getId());
//		assertNull(result.get(0).getName());
//		assertEquals("", result.get(0).getSurname());
//		assertNull(result.get(0).getJob());
//		assertNull(result.get(0).getSalary());
//		assertEquals(2, result.get(1).getId());
//		assertEquals("Jane", result.get(1).getName());
//		assertEquals("Doe", result.get(1).getSurname());
//		assertEquals("Janitor", result.get(1).getJob());
//		assertEquals(new BigDecimal("13"), result.get(1).getSalary());
//	}
}