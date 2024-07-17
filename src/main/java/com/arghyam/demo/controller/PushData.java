package com.arghyam.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class PushData {

	@GetMapping(value = "/push")
	public String insertWaterQuality(@RequestParam(name="hard", required=false) Integer hardValue) {
		System.out.print(hardValue);
		return "Success";
	}

}
