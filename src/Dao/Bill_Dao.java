package Dao;

import DButils.DButils;
import Object_Project.User_MeiRong;
/**
 * 
 * @author zbs
 *	Bill表专用Dao层
 */
public class Bill_Dao {
	DButils db = new DButils();
	
	/**
	 * lcy
	 * @param user
	 * 宠物美容院    更新Bill表
	 */
	public int beauty(User_MeiRong user){
		
		String sql="insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no=db.preUpdate(sql,user.getName(),user.getPhone(),user.getConsumeType(),user.getMoney());
		return no;
	}
	

}
