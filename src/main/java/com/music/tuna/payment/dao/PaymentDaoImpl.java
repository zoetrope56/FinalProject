package com.music.tuna.payment.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.music.tuna.payment.vo.Payment;
import com.music.tuna.util.SqlSessionFactoryBean;

@Repository
public class PaymentDaoImpl implements PaymentDao{


	private SqlSession sqlSession;
	
	@Override
	public int insertPayment(Payment p) {
		System.out.println("다오 임플 리턴 되나");
		return sqlSession.insert("payment.insertPayment",p);
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		sqlSession.commit();
		System.out.println("sql문 커밋 된다");
		
	}

}
	


