package com.nirmaan.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.pro.entity.Question;
import com.nirmaan.pro.service.QuestionService;

@RestController
@RequestMapping("QuizApplication")
public class QuestionController {

	@Autowired
	public QuestionService qs;

	@PostMapping("c")
	public Question postMapping(@RequestBody Question q) {
		return qs.createNewQuestion(q);

	}

	@GetMapping("All/{qid}")
	
	public Question getMapping(@PathVariable int qid) {
		return qs.getExisting(qid);
	}
	@PutMapping("All/{id}")
	public Question updateMapping(@PathVariable int qid,@RequestBody Question q)
	{
		return qs.update(qid, q);
	}
}