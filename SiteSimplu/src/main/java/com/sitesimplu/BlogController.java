package com.sitesimplu;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
	
	
	@RequestMapping(value="/blog")
	public String serveBlog(Model model) {
		Post post1 = new Post("titlu1", "continutul 1");
		Post post2 = new Post("titlu2", "continutul 2");
		Post post3 = new Post("titlu3", "continutul 3");
		Post post4 = new Post("titlu4", "continutul 4");
		Post post5 = new Post("titlu5", "continutul 5");
		String autor = "autorul principal";
		
		List<Post> listaPosturi = Arrays.asList(post1, post2, post3, post4, post5);
		
		model.addAttribute("posturi", listaPosturi);
		model.addAttribute("autorul", autor);
		
		
		return "blog";
	}
	
	@RequestMapping(value="/profesor")
	public String[] serveOrarProfesor() {
		return SiteSimpluApplication.prof.getOrarMaster();
		
	}
	
}
