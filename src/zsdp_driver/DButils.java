package zsdp_driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {
	
	private static final String URL ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USER ="scott";
	private static final String PASS ="tiger";
	
	private Connection conn =null;
	private PreparedStatement ps =null;
	private ResultSet rs =null;
	
	
	
	static {
		//1.��������
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	
	
	//���·���
	public int preUpdate(String sql,Object...arr) throws SQLException {
		//2.��������
		//3.ִ��
		int no =0;
		conn = DriverManager.getConnection(URL,USER,PASS);
		
		//����ִ�ж���1.Ԥ����  2.����ֵ  3.ִ��
		ps = conn.prepareStatement(sql);
		
		if (arr!=null) {
			for (int i = 0; i < arr.length; i++) {
				ps.setObject(i+1,arr[i]);
			}
		}
		
		no =ps.executeUpdate();
		close();
		
		return no;
	}
	
	
	
	//��ѯ����
	public ResultSet preQuery(String sql, Object...arr)  {
		
		try {
			conn =DriverManager.getConnection(URL,USER,PASS);
			ps =conn.prepareStatement(sql);
			if(arr!=null) {
				for (int i = 0; i < arr.length; i++) {
					ps.setObject(i+1,arr[i]);
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return rs;
	}
	
	
	
	public void close() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		
		
		try {
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
