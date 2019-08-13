package Service;

import Dao.Bill_Dao;
import Object_Project.User_MeiRong;
/**
 * 
 * @author zbs
 * 消费记录  连接 Bill表
 *	 
 */
public class Bill_Service {
	Bill_Dao d=new Bill_Dao();
	
	/**
	 * lcy
	 * @param user
	 * 更新Bill表，增加消费记录
	 */
	public int beauty(User_MeiRong user){
		int no=d.beauty(user);
		return no;
		
	}

}
