package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * lcy
 */
public class DbUtill {
	private static final String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String USER="system";
	private static final String PASS="oracle";
	
	private Connection conn=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	static{
		//加载驱动		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		//更新
		public int  preUpset(String sql,Object...arr){
			int no=0;
			
			//创建链接
			try {
				conn = DriverManager.getConnection(URL, USER, PASS);
				ps = conn.prepareStatement(sql);
				if(arr!=null){
					for (int i = 0; i < arr.length; i++) {
						ps.setObject(i+1, arr[i]);
					}
				}
				no=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				close();
			}
	
		 return no;
		//关闭
		
	}
		//查询
		public ResultSet preQuery(String sql,Object...arr){
			
			//创建链接
			try {
				conn=DriverManager.getConnection(URL,USER,PASS);
				ps=conn.prepareStatement(sql);
				//设置值
				if(arr!=null){
					for (int i = 0; i < arr.length; i++) {
						ps.setObject(i+1, arr[i]);
					}
				}
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			return rs;
			
		}
		
		
		//关闭
		public void close(){
			if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
			
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}
