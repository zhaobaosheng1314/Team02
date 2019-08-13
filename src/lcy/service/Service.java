package lcy.service;

import lcy.Utill.DbUtill;
import lcy.dao.Dao;
import lcy.property.User;
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
