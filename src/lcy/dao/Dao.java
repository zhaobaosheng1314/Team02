package lcy.dao;

import lcy.Utill.DbUtill;
import lcy.property.User;
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
