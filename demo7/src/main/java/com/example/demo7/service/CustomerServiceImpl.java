package com.example.demo7.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

	@Scope("singleton")
	@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
     
	@Value("10")
	private int count;
	
	
	public int getCount() {
		return count;
	}
	

	public void setCount(int count) {
		this.count = count;
	}



	@Override
	public String fetchCustomer() {
		return "The number of customer fetched are :" + count;
	}
	
	

}
