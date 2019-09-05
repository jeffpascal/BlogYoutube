package com.sitesimplu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiteSimpluApplication {

	private static ArrayList<Student> listaStudenti;
	public static Profesor prof;
	public static void main(String[] args) {
		init();
		SpringApplication.run(SiteSimpluApplication.class, args);
	}

	private static void init() {
		Student student1 = new Student(new String[] {"mate","mate","mate","romana"}, null);
		Student student2 = new Student(new String[] {"mate","mate","mate","romana"}, null);
		listaStudenti = new ArrayList<>();
		listaStudenti.add(student1);
		listaStudenti.add(student2);
		
		prof = new Profesor(listaStudenti, "Marian");
		
	}

}
