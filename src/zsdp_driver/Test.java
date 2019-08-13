package zsdp_driver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws NumberFormatException, SQLException {
//		Scanner input =new Scanner(System.in);
//		
//		System.out.println("请输入用户名：");
//		String name =input.next();
//		System.out.println("请输入密码：");
//		String pass =input.next();
//		
		
		DButils db =new DButils();
		String sql ="select * from emp";
		ResultSet rs =db.preQuery(sql);
		while(rs.next()) {
			int no =Integer.parseInt(rs.getObject("empno").toString());
			System.out.println(no);
		}
		db.close();
		
	}

}
