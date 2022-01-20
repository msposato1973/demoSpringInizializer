package com.demo.demoSpringInizializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringInizializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringInizializerApplication.class, args);
	}

}
