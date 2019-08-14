package Object_Project;

public class User_Login {
	private String phone;
	private String password;
	private boolean flag = false;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User_Login(String phone, String password) {
		super();
		this.phone = phone;
		this.password = password;
	}

	public User_Login() {
		super();
	}

}
