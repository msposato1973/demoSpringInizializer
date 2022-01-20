package com.demo.demoSpringInizializer.controller;
 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.demoSpringInizializer.service.CovidRestDataService;

@Controller
public class HomeController {

	@Autowired
	CovidRestDataService covidRestDataService;
	
	// inject via application.properties
    @Value("${welcome.message}")
    private String message;
    
    @Value("${date.format}")
    private String dtFormat;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", message);
		model.addAttribute("records", covidRestDataService.getAllRecord());
		model.addAttribute("serverTime", getDateFormat());
		return "home";
	}
	
	private String getDateFormat() {
		return new SimpleDateFormat(dtFormat).format(new Date());
	} 
}
