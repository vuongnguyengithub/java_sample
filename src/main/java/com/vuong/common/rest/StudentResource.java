package com.vuong.common.rest;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.vuong.common.model.Student;
import com.vuong.common.repository.StudentRepository;
import com.vuong.common.service.CompanyService;
import com.vuong.common.service.RequestScopedBean;
import com.vuong.common.service.UnknownService;

import io.swagger.annotations.Api;

@Path("students")
@Api("students")
public class StudentResource {
	
	private static final Logger LOGGER = Logger.getLogger(StudentResource.class);
	
	@Inject
	private StudentRepository studentRepo;
	
	@Inject
	private UnknownService companyService; 
	
	@Inject
	private RequestScopedBean requestScopedBean;
	
	@GET
	@Path("/company")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessage() {
		String s = new Gson().toJson(companyService.getMessage());
		return Response.ok(s).build();
	}
	

	@GET
	@Path("/requestScopedBean")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessagerequestScopedBean() {
		String s = new Gson().toJson(requestScopedBean.getMessage());
		return Response.ok(s).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		String language = CDI.current().select(HttpServletRequest.class).get().getLocale().getLanguage();
		LOGGER.error("Language: " + language);
		return Response.ok(studentRepo.getAll()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student student) {
		studentRepo.add(student);
	}
	
	@Path("{id}")
	@DELETE
	public void deleteStudent(@PathParam("id")Long id) {
		studentRepo.remove(id);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(Student student) {
		studentRepo.update(student);
	}
}
