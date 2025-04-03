package com.arquitechthor.inditest;

import org.springframework.boot.SpringApplication;

public class TestInditestApplication {

	public static void main(String[] args) {
		SpringApplication.from(InditestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
