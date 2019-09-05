package com.sitesimplu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Profesor {
	
	private ArrayList<Student> listaStudenti;

	public ArrayList<Student> getListaStudenti() {
		return listaStudenti;
	}
	public void setListaStudenti(ArrayList<Student> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}
	public ArrayList<String> getOrarMaster() {
		return orarMaster;
	}
	public void setOrarMaster(ArrayList<String> orarMaster) {
		this.orarMaster = orarMaster;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public Profesor(ArrayList<Student> listaStudenti, String nume) {
		super();
		
		this.listaStudenti = listaStudenti;
		this.nume = nume;
		List<String> list= generateMaster();
		orarMaster = new ArrayList<String>(list);
		
	}


	private List<String> generateMaster() {
		
		return listaStudenti.stream().flatMap(a -> Stream.of(a.getOrar())).collect(Collectors.toList());
		
		
	}


	private ArrayList<String> orarMaster;
	private String nume;
	
}
