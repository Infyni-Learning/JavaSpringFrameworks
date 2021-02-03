package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaytmService {

	@Autowired
	RestTemplate restTempate;				//DI for RestTemplate
	
	public String updateAmount(int accno, float amount) {
		//ResponseEntity<String> res= restTempate.getForEntity("http://localhost:9292/account/update/"+accno+"/"+amount,String.class);
		ResponseEntity<String> res= restTempate.getForEntity("http://ACCOUNT-SERVICE-ORACLE/account/update/"+accno+"/"+amount,String.class);
		return res.getBody();
	}
}
