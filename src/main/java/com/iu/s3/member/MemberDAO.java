package com.iu.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s3.member.memberDAO"
	
	public List<BankBOOKDTO> getList() throws Exception{
		return sqlSession.selectList(NAMESPACE+".getList");
	}
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception{ 

		//long num = 1L; 

		accountDTO= sqlSession.selectOne(NAMESPACE+".getSelect", accountDTO);
		return accountDTO; 

	} 



}