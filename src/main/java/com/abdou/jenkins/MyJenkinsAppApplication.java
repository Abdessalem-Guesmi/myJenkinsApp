package com.abdou.jenkins;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyJenkinsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJenkinsAppApplication.class, args);
		System.out.println("hello jenkins, test the Maven Project!!");
	}
	@GetMapping("/test")
	public Map<String, Object> message(){
		Map<String, Object> data = new HashMap<>();
		data.put("name", "Friend");
		data.put("counter", 123);
		return data;
	}

}

