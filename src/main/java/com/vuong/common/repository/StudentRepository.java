package com.vuong.common.repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import com.vuong.common.model.Student;

@ApplicationScoped
public class StudentRepository {
	private LinkedHashMap<Long, Student> students = new LinkedHashMap<>();
	
	public void add(Student student) {
		Long id = student.getId();
		if (Objects.isNull(id)) {
			id = getNextId();
		}
		
		students.put(id, student);
	}
	
	public void remove(Long id) {
		students.remove(id);
	}
	
	public List<Student> getAll() {
		return students.values().stream().collect(Collectors.toList());
	}
	
	public void update(Student student) {
		add(student);
	}
	
	public Student getStudentById(Long id) {
		return students.get(id);
	}
	
	private Long getNextId() {
		return students.keySet().stream().sorted((a,b)-> b.compareTo(a)).findFirst().orElse(1L);
	}
}
