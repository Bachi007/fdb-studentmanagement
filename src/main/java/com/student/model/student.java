package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;


@Getter 
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentBranch;
	private String studentPhone;
	
	
	
}
