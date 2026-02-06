package com.gateway.testdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

@SpringBootApplication
public class TestDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDeployApplication.class, args);
	}

	// Yahi aapka endpoint ban jayega
	@Bean
	public Function<String, String> tasks() {
		return (input) -> "SPRING CLOUD: UP UP UP. Input was: " + input;
	}
}