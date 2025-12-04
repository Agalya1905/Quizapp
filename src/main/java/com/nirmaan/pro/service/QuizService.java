package com.nirmaan.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.pro.entity.Quiz;
import com.nirmaan.pro.repository.QuizRepo;

@Service
public class QuizService {

	@Autowired
	public QuizRepo qzr;

	public Quiz createNewQuiz(Quiz qz) {
		return qzr.save(qz);
	}

	public Quiz getExisting(int qzid) {
		return qzr.findById(qzid).get();
	}

	public List<Quiz> getAllQuiz() {
		return qzr.findAll();
	}

}
