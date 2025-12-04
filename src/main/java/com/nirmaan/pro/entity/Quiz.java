package com.nirmaan.pro.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="tbl_Quiz")
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qzid;

	private String qztext;
	
	
	
	@OneToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
	@JsonManagedReference
	public List<Question> questions = new ArrayList<>();
	
}