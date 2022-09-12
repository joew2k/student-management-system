package com.studentmanagementsystem.studentmanagementsystem;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student joe = new Student(
				"Joseph",
				"Adakole",
				new Date(1990079),
				21,
				"joseph23@gmail.com"
		);

		Student Mary = new Student(
				"mary",
				"IKe",
				new Date(1980079),
				21,
				"joseper23@gmail.com"
		);
		studentRepository.saveAll(List.of(
				joe, Mary
		));
	}
}
