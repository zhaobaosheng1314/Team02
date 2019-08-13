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

	// ��������
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���·���
	public int preUpdate(String sql, Object... arr) {
		int no = 0;
		try {
			// ��������
			conn = DriverManager.getConnection(URL, USER, PASS);
			// ����ִ�ж���
			ps = conn.prepareStatement(sql);
			// ps������---->Ԥ���룬����ֵ��ִ��
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

	// ��ѯ����
	public ResultSet preQuery(String sql, Object... arr) throws SQLException {
		// ��������
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		// ����ִ�ж���
		PreparedStatement ps = conn.prepareStatement(sql);
		// ������
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				ps.setObject(i + 1, arr[i]);
			}
		}
		rs = ps.executeQuery();
		return rs;
	}

	// �ͷ���Դ
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
