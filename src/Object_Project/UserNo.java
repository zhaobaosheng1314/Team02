package Object_Project;

public class UserNo {
	private String name;
	private String password;
	private String phone;
	private String adress;
	private double money=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public UserNo(String name, String password, String phone, String adress) {
		super();
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.adress = adress;
	}
	
}
