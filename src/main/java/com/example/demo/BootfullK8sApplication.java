package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootfullK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootfullK8sApplication.class, args);
	}

	@Bean
	InitializingBean initializingBean() {
		return () -> System.out.println("Hello K8s!!");
	}

}
