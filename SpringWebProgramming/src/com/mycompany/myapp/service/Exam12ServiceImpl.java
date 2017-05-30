package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam12Dao;
import com.mycompany.myapp.dto.Board;

@Component
public class Exam12ServiceImpl implements Exam12Service {
	@Autowired
	private Exam12Dao dao;
	
	@Override
	public void write(Board board) {
		dao.insert1(board);
	}

}
