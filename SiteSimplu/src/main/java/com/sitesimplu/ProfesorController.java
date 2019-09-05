package com.sitesimplu;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProfesorController {
	
	@RequestMapping(value="/profesor")
	public ArrayList<String> serveOrarProfesor() {
		return SiteSimpluApplication.prof.getOrarMaster();
		
	}
}
