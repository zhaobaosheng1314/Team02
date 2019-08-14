package Service;

import java.sql.SQLException;

import Dao.UserHave_Dao;
import Object_Project.UserHave;
import Object_Project.User_Login;

/**
 * 
 * ����User_have ��
 */
public class UserHave_Service {
	UserHave_Dao uh = new UserHave_Dao();

	/**
	 * ��¼��֤
	 * 
	 * @param phone1
	 *            ������ֻ���
	 * @return
	 * @throws SQLException
	 */
	public int found(String phone1) throws SQLException {
		int no = uh.found(phone1);
		return no;
	}

	/**
	 * ��¼��֤
	 * 
	 * @param phone1
	 * @param password1
	 * @throws SQLException
	 */
	public void logon(User_Login user) throws SQLException {
		User_Login user1 = uh.logon(user);
		if (user.getPassword().equals(user1.getPassword())) {

		} else {
			throw new RuntimeException("��������ֻ��Ż��������");
		}

	}

	/**
	 * ע�� �г�
	 * 
	 * @param uh2
	 * @throws SQLException
	 */
	public void login(UserHave uh2) throws SQLException {
		int no = uh.loginCheck(uh2.getUserNo().getPhone());
		if (no == 1) {
			throw new RuntimeException("����ֻ����Ѿ���ע����~~~");
		} else {
			// ע��ɹ�
			uh.login(uh2);
		}

	}

}
