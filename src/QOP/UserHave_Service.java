package QOP;

import java.sql.SQLException;

import QOP.UserHave_Dao;
import QOP.User;

/**
 * 
 *	����User_have �� 
 */
public class UserHave_Service {
	UserHave_Dao uh = new UserHave_Dao();

	/**
	 * ��¼��֤
	 * @param phone1 ������ֻ���
	 * @return 
	 * @throws SQLException 
	 */
	public int found(String phone1) throws SQLException {
		int no =uh.found(phone1);
		return no;
	}
	/**
	 * ��¼��֤
	 * @param phone1
	 * @param password1
	 * @throws SQLException 
	 */
	public void logon(User user) throws SQLException {
		User user1 =uh.logon(user);
		if(user.getPassword().equals(user1.getPassword())){
			
		}else{
			throw new RuntimeException("��������ֻ��Ż��������");
		}
		
	}

	
}
