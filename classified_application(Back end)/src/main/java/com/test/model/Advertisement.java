package com.test.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Advertisement {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String title;
	private String text;
	private Date postDateTime;
	private String status;
	private String location;
	private String lastDate;
	private double price;
	
	
	
	@Autowired
	@ManyToOne
	private User user;
	
	@Autowired
	@ManyToOne
	private Category category;
	
}

