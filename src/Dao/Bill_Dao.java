package Dao;

import DButils.DButils;
import Object_Project.User_MeiRong;
/**
 * 
 * @author zbs
 *	Bill��ר��Dao��
 */
public class Bill_Dao {
	DButils db = new DButils();
	
	/**
	 * lcy
	 * @param user
	 * ��������Ժ    ����Bill��
	 */
	public int beauty(User_MeiRong user){
		
		String sql="insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no=db.preUpdate(sql,user.getName(),user.getPhone(),user.getConsumeType(),user.getMoney());
		return no;
	}
	

}
