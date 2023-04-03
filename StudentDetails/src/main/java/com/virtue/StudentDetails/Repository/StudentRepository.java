package com.virtue.StudentDetails.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.virtue.StudentDetails.model.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
	List<Student> findTop3ByOrderByPercentageDesc();

}
