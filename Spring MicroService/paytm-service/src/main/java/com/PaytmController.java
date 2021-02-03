package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "paytm")
public class PaytmController {

	
	@Autowired
	PaytmService paytmService;
	
	@GetMapping(value = "wallet/{accno}/{amount}")
	public String updateAccountThrougPaytm(@PathVariable("accno") int accno, @PathVariable("amount") float amount) {
		return paytmService.updateAmount(accno, amount);
	}
}
