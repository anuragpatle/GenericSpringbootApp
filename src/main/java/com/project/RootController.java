package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project._1_rest_and_mvc_example.repository.StudentRepository;

@Controller
@RequestMapping("/GenericSpringbootApp/")
public class RootController {

	private final StudentRepository studentRepository;

	@Autowired
	public RootController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	// This method is optional
	@GetMapping("/")
	public String showSignUpForm(Model model) {
		return "index";
	}

}
