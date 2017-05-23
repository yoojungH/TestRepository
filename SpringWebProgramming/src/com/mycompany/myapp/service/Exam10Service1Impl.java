package com.mycompany.myapp.service;

import com.mycompany.myapp.dao.Exam10Dao1;
import com.mycompany.myapp.dao.Exam10Dao1Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exam10Service1Impl implements Exam10Service1 {
	/* 필드 주입 */
	@Autowired
	private Exam10Dao1 exam10Dao;
	
	@Override
	public void join() {
		System.out.println("Exam10Service1Impl --- join() 실행");
		exam10Dao.insert();
	}

	@Override
	public void login() {
		System.out.println("Exam10Service1Impl --- login() 실행");
		exam10Dao.select();
	}

}
