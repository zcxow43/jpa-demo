package com.oapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class MmsOapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmsOapiApplication.class, args);
	}
}