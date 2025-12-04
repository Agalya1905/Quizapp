package com.nirmaan.pro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.pro.entity.Question;
import com.nirmaan.pro.repository.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	public QuestionRepo qr;

	public Question createNewQuestion(Question q) {
		return qr.save(q);
	}

	public Question getExisting(int qid) {
		return qr.findById(qid).get();
	}
	public Question update(int qid,Question update) {
		Question old=getExisting(qid);
	    old.setQtext(update.getQtext());
	    return qr.save(old);
	
	}

}
