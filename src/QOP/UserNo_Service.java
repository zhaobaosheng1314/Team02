package QOP;

import java.sql.SQLException;

import QOP.UserNo_Dao;
import QOP.User;
/**
 * 连接 user_no表
 *
 */
public class UserNo_Service {
	UserNo_Dao un = new UserNo_Dao();

	/**
	 * 登录验证
	 * zbs
	 * @param phone1
	 * @return 
	 * @throws SQLException 
	 */
	public int found(String phone1) throws SQLException {
		int no =un.found(phone1);
		return no;
	}

	/**
	 * 
	 * @param user
	 * @throws SQLException 
	 */
	public void logon(User user) throws SQLException {
		User user1 =un.logon(user);
		if(user.getPassword().equals(user1.getPassword())){
			
		}else{
			throw new RuntimeException("您输入的手机号或密码错误");
		}
		
	}
	
}
