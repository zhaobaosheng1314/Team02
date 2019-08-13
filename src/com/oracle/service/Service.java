package com.oracle.service;

import com.oracle.Utill.DbUtill;
import com.oracle.dao.Dao;
import com.oracle.property.User;
/*
 * lcy
 */
public class Service {
	DbUtill db=new DbUtill();
	Dao d=new Dao();
	
	//Ôö¼Ó
	public int beauty(User user){
		int no=d.beauty(user);
		return no;
		
	}

}
