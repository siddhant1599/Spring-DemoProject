package com.codingninja.kzr.Intro.IntroDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroDemoApplication implements CommandLineRunner {

	@Autowired
	Apple a;

	@Autowired
	private DBService service;

	public static void main(String[] args) {
		SpringApplication.run(IntroDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		a.eatApple();
		service.getData();
	}

}
