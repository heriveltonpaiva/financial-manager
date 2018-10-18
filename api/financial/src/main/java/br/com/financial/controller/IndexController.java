package br.com.financial.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class IndexController {

	@GetMapping("/index")
	public String getIndex() {
		return "First RestService!";
	}
}
