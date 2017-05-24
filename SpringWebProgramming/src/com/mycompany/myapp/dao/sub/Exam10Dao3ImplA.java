
package com.mycompany.myapp.dao.sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam10Dao3;


@Component("subExam10Dao3ImpleA")
public class Exam10Dao3ImplA implements Exam10Dao3{
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam10Dao3ImplA.class);
	@Override
	public void insert(){
		LOGGER.info("회원가입");
	}
	
	@Override
	public void select(){
		LOGGER.info("로그인");
	}
}
