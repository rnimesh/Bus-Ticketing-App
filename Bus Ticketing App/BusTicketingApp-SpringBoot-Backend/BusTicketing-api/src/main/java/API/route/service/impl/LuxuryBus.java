package API.route.service.impl;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import API.route.repository.BusRoute;

@Component
public class LuxuryBus implements BusRoute{

	@Autowired
	private Validator validator;
	
	@Override
	public String getBusType() {
		// TODO Auto-generated method stub
		return "LuxuryBus";
	}

	@Override
	public double applyAlgorithm(double distance) {
		// TODO Auto-generated method stub
		double price;
		
		if(distance==0){
			
			return -1;
		}else{

		price=(distance/10)*15;

		return price;
	
		}

	}

}
