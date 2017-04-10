package com.vuong.common.service;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CompanyService implements UnknownService {
	
	@Override
	public String getMessage() {
		return "Hello" + this.getClass().getSimpleName();
	}
}
