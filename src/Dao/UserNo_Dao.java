package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import DButils.DButils;
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
	public User_Login logon(User_Login user) throws SQLException {
		sql = "select password from user_no where phone=?";
		ResultSet rs =db.preQuery(sql, user.getPhone());
		String password =null;
		if(rs.next()){
			 password = rs.getString("password");
		}
		return new User_Login(user.getPhone(),password);
	}
}
