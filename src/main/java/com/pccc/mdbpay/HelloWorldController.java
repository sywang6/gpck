package com.pccc.mdbpay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String index() {
		//添加注释
		return "Hello World";
	}
}
	

