package com.example.restservice;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppleController {

	@GetMapping("/appleTotals")
	public AppleTotals apple(@RequestParam(value = "stint_a", defaultValue = "0") String stint_a) {
		AppleTotals totals = new AppleTotals();
		totals.setStint_a(Long.parseLong(stint_a));

		return totals;
	}
	@GetMapping("/applePicking")
	public ApplePicking applePicking(@RequestParam Map<String,String> requestParams)
	{
		return new ApplePicking(
				Long.parseLong(requestParams.get("ken")),
				Long.parseLong(requestParams.get("alice")));
	}
}
