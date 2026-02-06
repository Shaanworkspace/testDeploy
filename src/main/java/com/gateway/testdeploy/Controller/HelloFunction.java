package com.gateway.testdeploy.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class HelloFunction {
	public String handleRequest(String input) {
		return "SUCCESS: UP UP UP";
	}
}