package br.com.totvsplanning.planning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TelaPrincipal {

	@RequestMapping("/")
	@ResponseBody
	public String novo() {
		return "Ola mundo teste teste teste ";
	}
}
