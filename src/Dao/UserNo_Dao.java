package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import DButils.DButils;
import Object_Project.UserNo;
import Object_Project.User_Login;
/**
 * 
 * User_no �� ר��Dao��
 */
public class UserNo_Dao {

	DButils db = new DButils();
	String sql;
	/**
	 * ��¼��֤
	 * zbs
	 * @param phone1
	 * @return
	 * @throws SQLException 
	 */
	public int found(String phone1) throws SQLException {
		int no = 2 ;
		sql="select * from user_no where phone=?";
		ResultSet rs =db.preQuery(sql, phone1);
		if(rs.next()){
			return no=3;
		}else{
			return no;
		}
	}
	/**
	 * ��¼��֤
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public User_Login logon(User_Login user) throws SQLException {
		sql = "select password from user_no where phone=?";
		ResultSet rs =db.preQuery(sql, user.getPhone());
		String password =null;
		if(rs.next()){
			 password = rs.getString("password");
		}
		return new User_Login(user.getPhone(),password);
	}
	/**
	 * ע��
	 * @param phone
	 * @return 
	 * @throws SQLException 
	 */
	public int loginCheck(String phone) throws SQLException {
		sql="select * from user_no where phone=?";
		ResultSet rs = db.preQuery(sql, phone);
		int no =0;
		if(rs.next()){
			return no=1;
		}
		return no;
	}
	/**
	 * ע��ɹ����洢����
	 * @param un2
	 */
	public void login(UserNo un2) {
		sql="insert into user_no (name,phone,password,address,money)values(?,?,?,?,?)";
		db.preUpdate(sql, un2.getName(),un2.getPhone(),un2.getPassword(),un2.getAdress(),un2.getMoney());
	}
}
