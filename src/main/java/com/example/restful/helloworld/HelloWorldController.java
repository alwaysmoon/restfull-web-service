package com.example.restful.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSoruce;
	
	//GET
	// /hello-world (endpoint)
	// @RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	// 가변 변수
	// overloading
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable(value="name") String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	@GetMapping(path= "/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		return messageSoruce.getMessage("greeting.message", null, locale);
	}
}
