package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.TeacherDao;
import com.jsp.schoolmanagement.dto.Teacher;

public class InsertTeacher {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setId(3);
		t1.setName("varun");
		t1.setLoc("navi mumbai");

		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.insertTeacher(t1);
		System.out.println(teacher.getName() + " Record inserted");
	}

}
