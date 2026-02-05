package com.gateway.testdeploy.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	@GetMapping
	public String test() {
		return "UP UP UP";
	}

}