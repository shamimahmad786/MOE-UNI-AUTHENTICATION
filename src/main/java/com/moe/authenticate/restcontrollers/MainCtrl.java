package com.moe.authenticate.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainCtrl {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
}
