package com.oracle.dao;

import com.oracle.Utill.DbUtill;
import com.oracle.property.User;
/*
 * lcy
 */
public class Dao {
	DbUtill db=new DbUtill();
	
	//����Bill�˵�����
	public int beauty(User user){
		
		String sql="insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no=db.preUpset(sql,user.getName(),user.getPhone(),user.getConsumeType(),user.getMoney());
		return no;
	}
	

}
