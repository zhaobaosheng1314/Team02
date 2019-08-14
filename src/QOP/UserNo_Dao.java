package QOP;

import java.sql.ResultSet;
import java.sql.SQLException;

import DButils.DButils;
import QOP.User;
/**
 * 
 * User_no 表 专用Dao层
 */
public class UserNo_Dao {

	DButils db = new DButils();
	String sql;
	/**
	 * 登录验证
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
	public User logon(User user) throws SQLException {
		sql = "select password from user_no where phone=?";
		ResultSet rs =db.preQuery(sql, user.getPhone());
		String password =null;
		if(rs.next()){
			 password = rs.getString("password");
		}
		return new User(user.getPhone(),password);
	}
}
