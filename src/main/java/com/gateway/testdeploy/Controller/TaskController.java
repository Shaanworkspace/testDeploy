package com.gateway.testdeploy.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
	public String test(String input) {
		return "SUCCESS: UP UP UP";
	}
	@GetMapping("/")
	public String health() {
		return "ALIVE";
	}

	@GetMapping("/tasks")
	public String test() {
		return "UP UP UP";
	}
}