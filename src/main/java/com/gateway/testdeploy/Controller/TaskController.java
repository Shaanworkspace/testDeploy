package com.gateway.testdeploy.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
	@GetMapping("/")
	public String health() {
		return "ALIVE";
	}

	@GetMapping("/tasks")
	public String test() {
		return "UP UP UP";
	}
}