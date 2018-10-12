package com.in28minutes.microservices.currencyconversion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formatter.BigDecimalLayoutForm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from, 
			@PathVariable String to, @PathVariable BigDecimal quantity) {
		BigDecimal test2 = new BigDecimal("3").pow(1000);
		return new CurrencyConversion(1L, from, to, test2, quantity, quantity, 0);
	}
}
