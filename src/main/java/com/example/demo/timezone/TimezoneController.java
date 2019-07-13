package com.example.demo.timezone;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimezoneController {

	@RequestMapping("/timezones")
	public TimezoneModel timezone() {
		Map<String,String> result = TimezoneService.getTimezoneByArea();
		return new TimezoneModel(result.get("Asia/Bangkok"),result.get("Japan"),result.get("Europe/Moscow"));
	}
 
}
