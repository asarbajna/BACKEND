package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DAOUser;
import com.example.demo.entity.Formdetails;
import com.example.demo.entity.UserNewRegistration;
import com.example.demo.model.FormdetailsModel;
import com.example.demo.repository.FormDetailsRepository;


@RestController
@CrossOrigin
@RequestMapping("/formDetails")
public class FormSubmitController {
	@Autowired
	private FormDetailsRepository formRepo;
	
	@PostMapping("/submit")
	public Formdetails insertFormDetails(@RequestBody FormdetailsModel details) {
		System.out.println("this is personal details upload file controller");
		Formdetails details1=new Formdetails();
		details1.setFormType(details.getFormType());
		details1.setFormDesc(details.getFormDesc());
		details1.setFileId(details.getFileId());
		details1.setUserName(details.getUserName());
		return formRepo.save(details1);
		
		
	}
	@GetMapping("/gets")
	public String check()
	{
		return "hi";
	}
}
