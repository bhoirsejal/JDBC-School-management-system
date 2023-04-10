package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.TeacherDao;

public class DeleteTeacher {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.deleteTeacher(2);
	}

}
