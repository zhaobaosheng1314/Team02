package Service;

import java.sql.SQLException;

import Dao.UserHave_Dao;
import Object_Project.User_Login;

/**
 * 
 *	连接User_have 表 
 */
public class UserHave_Service {
	UserHave_Dao uh = new UserHave_Dao();

	/**
	 * 登录验证
	 * @param phone1 输入的手机号
	 * @return 
	 * @throws SQLException 
	 */
	public int found(String phone1) throws SQLException {
		int no =uh.found(phone1);
		return no;
	}
	/**
	 * 登录验证
	 * @param phone1
	 * @param password1
	 * @throws SQLException 
	 */
	public void logon(User_Login user) throws SQLException {
		User_Login user1 =uh.logon(user);
		if(user.getPassword().equals(user1.getPassword())){
			
		}else{
			throw new RuntimeException("您输入的手机号或密码错误");
		}
		
	}

	
}
