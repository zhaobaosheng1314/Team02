package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import DButils.DButils;
import Object_Project.User_Login;

/**
 * 
 *	User_have 表 专用Dao层
 */
public class UserHave_Dao {
	DButils db = new DButils();
	String sql ;
	/**
	 * 登录验证
	 * @param phone1
	 * zbs
	 * @throws SQLException 
	 */
	public int found(String phone1) throws SQLException {
		int no = 0 ;
		sql="select * from user_have where phone=?";
		ResultSet rs =db.preQuery(sql, phone1);
		if(rs.next()){
			return no=1;
		}else{
			return no;
		}
		
	}
	/**
	 * 登录验证
	 * zbs
	 * @param user
	 * @return 
	 * @throws SQLException 
	 */
	public User_Login logon(User_Login user) throws SQLException {
		sql = "select password from user_have where phone=?";
		ResultSet rs =db.preQuery(sql, user.getPhone());
		String password =null;
		if(rs.next()){
			 password = rs.getString("password");
		}
		return new User_Login(user.getPhone(),password);
	}

	

}
