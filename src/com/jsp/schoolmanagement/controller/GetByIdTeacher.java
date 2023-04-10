package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.TeacherDao;

public class GetByIdTeacher {
	public static void main(String[] args) {
		TeacherDao teacherDao=new TeacherDao();
		teacherDao.getByIdTeacher(3);
	}

}
