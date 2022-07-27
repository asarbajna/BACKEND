package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins/")
public class TestJenkins {
	@GetMapping("/test")
	public String hello()
	{
		Date date = new Date();
	      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	       String str = formatter.format(date);
	       String r="we will be back very soon , today is: "+str;
		return r;
	}
}
