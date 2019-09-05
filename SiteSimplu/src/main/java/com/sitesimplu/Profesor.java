package com.sitesimplu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Profesor {
	
	private ArrayList<Student> listaStudenti;
	@Override
	public String toString() {
		return "Profesor [listaStudenti=" + listaStudenti + ", orarMaster=" + Arrays.toString(orarMaster) + ", nume="
				+ nume + "]";
	}
	public ArrayList<Student> getListaStudenti() {
		return listaStudenti;
	}
	public void setListaStudenti(ArrayList<Student> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}
	public String[] getOrarMaster() {
		return orarMaster;
	}
	public void setOrarMaster(String[] orarMaster) {
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

		IntStream.range(0, list.size()).mapToObj(index -> String.format("%d -> %s", index, list.get(index))).forEach(System.out::println);
	}


	private List<String> generateMaster() {
		
		return listaStudenti.stream().flatMap(a -> Stream.of(a.getOrar())).collect(Collectors.toList());
		
		
	}


	private String[] orarMaster;
	private String nume;
	
}
