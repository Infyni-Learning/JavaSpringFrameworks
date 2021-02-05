package com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service-oracle")		// actual service name
public interface PaytmServiceFeignClient {

	@GetMapping(value="account/update/{accno}/{amount}")
	public String updateAmount(@PathVariable("accno") int accno, @PathVariable("amount") float amount);
}
