package Service;

import Dao.Bill_Dao;
import Object_Project.User_MeiRong;
/**
 * 
 * @author zbs
 * ���Ѽ�¼  ���� Bill��
 *	 
 */
public class Bill_Service {
	Bill_Dao d=new Bill_Dao();
	
	/**
	 * lcy
	 * @param user
	 * ����Bill���������Ѽ�¼
	 */
	public int beauty(User_MeiRong user){
		int no=d.beauty(user);
		return no;
		
	}

}
