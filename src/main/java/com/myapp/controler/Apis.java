package com.myapp.controler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dto.User;
import com.myapp.service.ServiceClass;

@RestController
public class Apis {

	@GetMapping("/first/{name}")
	public ResponseEntity<String> getFirstApi(@PathVariable("name")String name){
		ResponseEntity<String> x = new ResponseEntity<String>("hello "+name,HttpStatus.OK);
		return x;
	}
	
	@PostMapping("/second")
		public String sayHello(@RequestBody User user) {
		return "Hello" +user.getFirstName() + user;
	}
	
	@PostMapping("/third")
	public String sayHello(@RequestBody ServiceClass serviceClass) {
	return "Hello" + serviceClass.call();
}
}
