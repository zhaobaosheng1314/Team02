package com.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {               
	private static final String URL="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USER="scott";
	private static final String PASS="tiger";
	Connection  conn=null;
	PreparedStatement pre=null;
	ResultSet res=null;
	static{
		//加载驱动
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//更新
	public int preUpdate(String sql,Object...arr) {	
		int no = 0;
		  try {
			conn = DriverManager.getConnection(URL,USER,PASS);	
			  pre = conn.prepareStatement(sql);
			 if(arr!=null){
				 for (int i = 0; i < arr.length; i++) {
					pre.setObject(i+1, arr[i]);
				}				
			 } 
			 no  = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		
		return no;
		
	}
	public ResultSet preQuery(String sql,Object...arr){
		try {
			conn = DriverManager.getConnection(URL,USER,PASS);
			pre = conn.prepareStatement(sql);
			if(arr != null){
				for (int i = 0; i < arr.length; i++) {
					pre.setObject(i+1, arr[i]);
				}
				
			}
			res=pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return res;
		
	}
	public void close() {
		try {
			if(conn!=null){
			conn.close();
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(pre!=null){
				pre.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(res!=null){
				res.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
