package com.mycompany.myapp.service;

//import com.mycompany.myapp.dao.Exam10Dao;
import com.mycompany.myapp.dao.Exam10DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exam10ServiceImpl implements Exam10Service {

//	@Autowired
//	private Exam10Dao exam10Dao;

	@Autowired
	private  Exam10DaoImpl exam10DaoImpl;
	
	@Override
	public void join() {
		System.out.println("join() 실행");
		exam10DaoImpl.insert();
	}

	@Override
	public void login() {
		System.out.println("login() 실행");
		exam10DaoImpl.select();
	}

}
