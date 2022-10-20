package com.student;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import com.student.dao.studentdao;

public class AppTest{
	
	@Test
	public void testDelete() {
		
		studentdao dao=new studentdao();
		int id=12;
		assertAll(
				()->assertEquals(1,dao.deleteStudent(id)),
				()->assertEquals(0,dao.deleteStudent(2))
				);
		
	}
	
	
}