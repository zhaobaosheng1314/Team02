package Service;

import java.sql.SQLException;

import Dao.UserNo_Dao;
import Object_Project.UserNo;
import Object_Project.User_Login;
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
	public void logon(User_Login user) throws SQLException {
		User_Login user1 =un.logon(user);
		if(user.getPassword().equals(user1.getPassword())){
			
		}else{
			throw new RuntimeException("您输入的手机号或密码错误");
		}
		
	}
	/**
	 * 注册
	 * @param un2
	 * @throws SQLException 
	 */
	public void login(UserNo un2) throws SQLException {
		int no=un.loginCheck(un2.getPhone());
		if(no==1){
			throw new RuntimeException("这个手机号已经被注册啦~~~");
		}else{
			//注册成功
			un.login(un2);
		}
		
	}
	
}
