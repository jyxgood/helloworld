package com.yixin.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.yixin.example.controller.SampleController;
@EnableAutoConfiguration  
@ComponentScan
public class App {
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(SampleController.class, args);
	    }
}
