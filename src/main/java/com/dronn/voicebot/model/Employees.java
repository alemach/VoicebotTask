package com.dronn.voicebot.model;

import java.util.Arrays;

public class Employees {
	private Employee[] employees;

	public Employees() {
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employees employees1 = (Employees) o;
		return Arrays.equals(getEmployees(), employees1.getEmployees());
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(getEmployees());
	}
}
