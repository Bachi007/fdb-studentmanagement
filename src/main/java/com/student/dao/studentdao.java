package com.student.dao;

import java.util.List;

import org.hibernate.Session;

import com.student.config.hibernateUtil;
import com.student.model.student;

public class studentdao {

	//adding student
	public int addStudent(student s1) {
		
		try(Session ses=hibernateUtil.getSession()){
			ses.beginTransaction();
			{
				ses.save(s1);
				ses.getTransaction().commit();
				return 1;
			}
		}
	}
		//getting all students
	public List<student> getAllStudent(){
		try(Session ses=hibernateUtil.getSession()){			
			List<student> studentList=ses.createQuery("from student").getResultList();
			return studentList;
	}
}
	//deleting students with id
	public int deleteStudent(int stId) {
		try(Session ses=hibernateUtil.getSession()){
			ses.beginTransaction();
			int count=ses.createQuery("delete from student where studentId = :stid").setParameter("stid", stId).executeUpdate();
			ses.getTransaction().commit();
			return count;
		}
	}
	//updating student phone
	public int updateStudentPhone(String newphone,int stId) {
		try(Session ses=hibernateUtil.getSession()){
		ses.beginTransaction();
			int count =ses.createQuery("update student set studentPhone=:phone where studentId=:stid").setParameter("phone", newphone).setParameter("stid", stId).executeUpdate();
			return count;
		}
	}
		
		
		
	
	}