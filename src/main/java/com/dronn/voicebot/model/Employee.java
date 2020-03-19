package com.dronn.voicebot.model;

import com.dronn.voicebot.converters.SalaryProcessor;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.processor.PreAssignmentProcessor;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
	@CsvBindByName
	private int id;
	@CsvBindByName
	private String name;
	@CsvBindByName
	private String surname;
	@CsvBindByName
	private String job;
	@PreAssignmentProcessor(processor = SalaryProcessor.class)
	@CsvBindByName
	private BigDecimal salary;

	public Employee() {
	}

	public Employee(int id, String name, String surname, String job, BigDecimal salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.job = job;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return getId() == employee.getId() &&
				Objects.equals(getName(), employee.getName()) &&
				Objects.equals(getSurname(), employee.getSurname()) &&
				Objects.equals(getJob(), employee.getJob()) &&
				Objects.equals(getSalary(), employee.getSalary());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getSurname(), getJob(), getSalary());
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", job='" + job + '\'' +
				", salary=" + salary +
				'}';
	}
}
