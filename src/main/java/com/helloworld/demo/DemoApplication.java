package com.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot 起動クラス
 */
@SpringBootApplication
@ComponentScan("com.helloworld.demo")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("##### Spring Boot Demo Program #####");
		SpringApplication.run(DemoApplication.class, args);
	}

}
