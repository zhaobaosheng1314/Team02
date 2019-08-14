package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import DButils.DButils;
import Object_Project.UserHave;
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
			db.close();
			return no=1;
		}else{
			db.close();
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
		db.close();
		return new User_Login(user.getPhone(),password);
	}
	/**
	 * 注册  有宠
	 * @param phone
	 * @return
	 * @throws SQLException 
	 */
	public int loginCheck(String phone) throws SQLException {
		sql="select * from user_have where phone=?";
		ResultSet rs = db.preQuery(sql, phone);
		int no =0;
		if(rs.next()){
			return no=1;
		}
		db.close();
		return no;
	}
	/**
	 * 注册成功   有宠，存储数据
	 * @param uh2
	 */
	public void login(UserHave uh2) {
		sql="insert into user_have (name,phone,password,address,money,petName,petAge,petType,petSex)values(?,?,?,?,?,?,?,?,?)";
		db.preUpdate(sql, uh2.getUserNo().getName(),uh2.getUserNo().getPhone(),
				uh2.getUserNo().getPassword(),uh2.getUserNo().getAdress(),
				uh2.getUserNo().getMoney(),uh2.getPetName(),uh2.getPetAge(),
				uh2.getPetType(),uh2.getSex());
	}

	

}
