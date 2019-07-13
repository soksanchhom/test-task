package com.example.demo.pi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PIController {
	
	@PostMapping(value = "/pi",headers = "Accept=application/json")
	public PiModel piModel(@RequestBody PiDto piDto) {
		 return new PiModel(PiService.SplitPi(piDto));
	}
	
}
