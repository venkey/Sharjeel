package com.example.conversion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.conversion.model.StudentBean;
import com.example.conversion.services.DemoDaoService;

@RestController
public class AllConversionController {

	@Autowired
	DemoDaoService demoDaoServices;

	@RequestMapping("/test")
	public String testJson() {
		return "hi";
	}

	@GetMapping("/xmlToJavaObj")
	public List<StudentBean> xmlToJavaObj() throws Exception {
		return demoDaoServices.xmlTojavaObj();
	}
}
