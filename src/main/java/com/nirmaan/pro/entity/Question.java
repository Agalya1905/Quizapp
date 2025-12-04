package com.nirmaan.pro.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb2_Question")
//if we dont use table hibernate will automatically create table name using class name

public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;

	private String qtext;

	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	@JsonManagedReference
	//this prevent infinite json loop.this annotation breaks the loop on parent.
	private List<Option> options = new ArrayList<>();
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn
	//it creates foreign key in question.
	private Quiz quiz;

	
	
}