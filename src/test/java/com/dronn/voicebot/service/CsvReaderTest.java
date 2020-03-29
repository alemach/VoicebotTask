package com.dronn.voicebot.service;

public class CsvReaderTest {
//	private Path pathOk;
//	private Path pathWithEmptyLine;
//	private Path pathWithNullFields;
//	private CsvReader reader;
//
//	@Before
//	public void setUp() throws Exception {
//		reader = new CsvReaderImpl();
//		pathOk = Paths.get("src/test/resources/test.csv");
//		pathWithEmptyLine = Paths.get("src/test/resources/testEmptyLine.csv");
//		pathWithNullFields = Paths.get("src/test/resources/testNullValue.csv");
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
//	public void whenEmptyLineMapFile() {
//
//		//when
//		List<Employee> result = reader.mapFile(pathWithEmptyLine);
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
//		assertEquals("", result.get(0).getName());
//		assertEquals("", result.get(0).getSurname());
//		assertEquals("", result.get(0).getJob());
//		assertNull(result.get(0).getSalary());
//		assertEquals("Jane", result.get(1).getName());
//		assertEquals("Doe", result.get(1).getSurname());
//		assertEquals("Janitor", result.get(1).getJob());
//		assertEquals(new BigDecimal("13"), result.get(1).getSalary());
//	}
}