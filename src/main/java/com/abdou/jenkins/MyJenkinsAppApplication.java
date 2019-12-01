package com.abdou.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyJenkinsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJenkinsAppApplication.class, args);
		System.out.println("hello jenkins, test the Maven Project!!");
	}

}
