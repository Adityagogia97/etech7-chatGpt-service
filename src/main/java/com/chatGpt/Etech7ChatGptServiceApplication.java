package com.chatGpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Etech7ChatGptServiceApplication {

	public static void main(String[] args) {
		//ApplicationInsights.attach();
		SpringApplication.run(Etech7ChatGptServiceApplication.class, args);
	}

}
