package Service;

import java.sql.SQLException;

import Dao.UserNo_Dao;
import Object_Project.UserNo;
import Object_Project.User_Login;
/**
 * ���� user_no��
 *
 */
public class UserNo_Service {
	UserNo_Dao un = new UserNo_Dao();

	/**
	 * ��¼��֤
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
			throw new RuntimeException("��������ֻ��Ż��������");
		}
		
	}
	/**
	 * ע��
	 * @param un2
	 * @throws SQLException 
	 */
	public void login(UserNo un2) throws SQLException {
		int no=un.loginCheck(un2.getPhone());
		if(no==1){
			throw new RuntimeException("����ֻ����Ѿ���ע����~~~");
		}else{
			//ע��ɹ�
			un.login(un2);
		}
		
	}
	
}
