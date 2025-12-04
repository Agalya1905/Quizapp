package com.nirmaan.pro.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "tb1_options")
@Data
public class Option {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	private String otext;
	
	private boolean correct;
	
	@ManyToOne
	@JsonBackReference
	private Question question;
	
}