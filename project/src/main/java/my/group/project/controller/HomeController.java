package my.group.project.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.group.project.Service.SuperHeroService;
import my.group.project.dto.SuperHero;

@Controller
public class HomeController {
	
	
	
	private SuperHeroService service;
	@Inject
	public void setService(SuperHeroService service) {
		this.service = service;
	}

	@RequestMapping(value ="/Review")
	public ModelAndView Review(@RequestParam(required=false, defaultValue="World") String name1) {
		ModelAndView ret = new ModelAndView("Review");
		// Adds an object to be used in home.jsp
		ret.addObject("name1", service.getSuperTeams());
		return ret;
	}
	
	
	@RequestMapping
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("hello");
		// Adds an object to be used in home.jsp
		ret.addObject("name", name);
		return ret;
	}
	
	
	@RequestMapping(value="/hi")
	public ModelAndView hi(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("hi");
		// Adds an object to be used in home.jsp
		ret.addObject("name", service.getAllSuperHeroes());
		return ret;
	}
	
	
	
}


