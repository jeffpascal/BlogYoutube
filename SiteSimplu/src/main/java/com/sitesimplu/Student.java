package com.sitesimplu;

import java.util.Arrays;

public class Student {
	private String[]orar;
	private String nume;
	public String[] getOrar() {
		return orar;
	}
	public void setOrar(String[] orar) {
		this.orar = orar;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "Student [orar=" + Arrays.toString(orar) + ", nume=" + nume + "]";
	}
	public Student(String[] orar, String nume) {
		super();
		this.orar = orar;
		this.nume = nume;
	}
	
	
}
