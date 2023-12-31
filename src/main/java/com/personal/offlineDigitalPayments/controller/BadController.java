package com.personal.offlineDigitalPayments.controller;

import org.springframework.stereotype.Controller;

@Controller
public class BadController {

	//writing really bad controller here

	public String badMethod(){
		System.out.println("Incorrect Response");
		return "Bad Response";
	}
}
