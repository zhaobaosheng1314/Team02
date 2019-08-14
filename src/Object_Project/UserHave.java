package Object_Project;

public class UserHave {

	private String petName;
	private String petType;
	private String petAge;
	private String Sex;
	private UserNo UserNo;

	public UserHave(String petName, String petType, String petAge, String Sex, UserNo UserNo) {
		this.petName = petName;
		this.petType = petType;
		this.petAge = petAge;
		this.Sex = Sex;
		this.UserNo = UserNo;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetAge() {
		return petAge;
	}

	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public UserNo getUserNo() {
		return UserNo;
	}

	public void setUserNo(UserNo userNo) {
		UserNo = userNo;
	}
}
