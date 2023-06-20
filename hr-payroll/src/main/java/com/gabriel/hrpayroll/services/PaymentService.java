package com.gabriel.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.gabriel.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long WorkerId, int days) {
		return new Payment("Bob", 200.00, days);
		
	}

}
