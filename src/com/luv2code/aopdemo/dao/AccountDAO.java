package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component    //spring will find it automatically using component scanning
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
}