package com.vuong.common.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RequestScopedBean {
	
	@Inject
	UnknownService service;
	
	public String getMessage() {
		return service.getMessage() + this.getClass().getName();
	}
}
