package com.virtue.StudentDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtue.StudentDetails.Repository.StudentRepository;
import com.virtue.StudentDetails.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student)
	{
		Student savedStudent=studentRepository.save(student);
		return ResponseEntity.ok(savedStudent);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable String id)
	{
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return ResponseEntity.ok(optionalStudent.get());
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable String id,@RequestBody Student student) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent())
		{
			Student existingStudent=optionalStudent.get();
			existingStudent.setName(student.getName());
			existingStudent.setFatherName(student.getFatherName());
			existingStudent.setMotherName(student.getMotherName());
			existingStudent.setRollNumber(student.getRollNumber());
			existingStudent.setSchoolName(student.getSchoolName());
			existingStudent.setPhoneNumber(student.getPhoneNumber());
			existingStudent.setEmail(student.getEmail());
			existingStudent.setSubjects(student.getSubjects());
			existingStudent.setPercentage(student.getPercentage());
			Student updatedStudent = studentRepository.save(existingStudent);
			return ResponseEntity.ok(updatedStudent);
			
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/top3")
	public ResponseEntity<List<Student>> getTop3Students()
	{
		List<Student> top3Students = studentRepository.findTop3ByOrderByPercentageDesc();
		return ResponseEntity.ok(top3Students);
	}
	

}
