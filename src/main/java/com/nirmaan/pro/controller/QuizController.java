package com.nirmaan.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.pro.entity.Quiz;
import com.nirmaan.pro.service.QuizService;

@RestController
@RequestMapping("QuizApp")
@CrossOrigin("*")
public class QuizController {

	@Autowired
	public QuizService qzs;

	@PostMapping("createqz")
	public Quiz postMapp(@RequestBody Quiz qz) {
		return qzs.createNewQuiz(qz);
	}

	@GetMapping("qAll/{qzid}")
	public Quiz getMapping(@PathVariable int qzid) {
		return qzs.getExisting(qzid);
	}

	@GetMapping("All")
	public List<Quiz> getMethodName() {
		return qzs.getAllQuiz();
	}

}
