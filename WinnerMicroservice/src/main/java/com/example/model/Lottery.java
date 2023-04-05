package com.example.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Lottery {
   public Lottery(Integer lotteryId) {
		// TODO Auto-generated constructor stub
	}

@Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(nullable = false)
   private Integer number;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}
   
   // getters and setters
}
