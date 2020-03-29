package com.dronn.voicebot.service;

import com.dronn.voicebot.model.Employee;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

//	@Rule
//	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
//	@Rule
//	public final TemporaryFolder folder = new TemporaryFolder();
//	@InjectMocks
//	private Calculator calculator = new CalculatorImpl(reader);
//	@Mock
//	private JsonReader jsonReader;
//	@Mock
//	private CsvReader csvReader;
//	private Employee employee1 = new Employee(1, "John", "Doe", "Teacher", new BigDecimal(12));
//	private Employee employee2 = new Employee(2, "Jane", "Doe", "Teacher", new BigDecimal(13));
//	private Path jsonPath;
//	private Path csvPath;
//
//	@Before
//	public void setUp() throws IOException {
//		jsonPath = folder.newFile("test.json").toPath();
//		csvPath = folder.newFile("test.csv").toPath();
//	}
//
//	@Test
//	public void printSalariesFromJson() {
//
//		//given
//		when(jsonReader.mapFile(jsonPath)).thenReturn(Arrays.asList(employee1, employee2));
//		//when
//		calculator.printSalariesFromJson(jsonPath);
//		//than
//		assertEquals("Teacher: 25.00\n", systemOutRule.getLog());
//	}
//
//	@Test
//	public void printSalariesFromCsv() {
//		//given
//		when(csvReader.mapFile(csvPath)).thenReturn(Arrays.asList(employee1, employee2));
//		//when
//		calculator.printSalariesFromCsv(csvPath);
//		//than
//		assertEquals("Teacher: 25.00\n", systemOutRule.getLog());
//	}
}