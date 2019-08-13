package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {

	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USER = "scott";
	private static final String PASS = "tiger";
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// 加载驱动
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 更新方法
	public int preUpdate(String sql, Object... arr) {
		int no = 0;
		try {
			// 创建链接
			conn = DriverManager.getConnection(URL, USER, PASS);
			// 创建执行对象
			ps = conn.prepareStatement(sql);
			// ps三件事---->预编译，设置值，执行
			if (arr != null) {
				for (int i = 0; i < arr.length; i++) {
					ps.setObject(i + 1, arr[i]);
				}
			}
			no = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return no;
	}

	// 查询方法
	public ResultSet preQuery(String sql, Object... arr) throws SQLException {
		// 创建链接
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		// 创建执行对象
		PreparedStatement ps = conn.prepareStatement(sql);
		// 三件事
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				ps.setObject(i + 1, arr[i]);
			}
		}
		rs = ps.executeQuery();
		return rs;
	}

	// 释放资源
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
