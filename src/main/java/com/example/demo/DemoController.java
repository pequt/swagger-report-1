package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class DemoController {
	@ApiOperation(value = "the API")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "success", response = SomeObject.class)
	})
	@GetMapping("/someObject")
	public SomeObject someObject() {
		return new SomeObject();
	}
}
