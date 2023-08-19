package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;

import java.util.Arrays;
import java.util.List;
@RestController
public class ApiController {
	
	@GetMapping("sd")
	public List<Student> display()
	{
		return Arrays.asList(new Student("Sana","Have a great day"),new Student("Zara","Courage matters the most"));
	}

}
