package Object_Project;

/**
 * 
 * @author lcy �˿� ����Ժ ���� ����
 */
public class User_MeiRong {
	private String name;// ���Ѷ�������
	private double money;// ���ѽ��
	private String phone;// �绰
	private String consumeType = "����";// ��������
	private final double washPrice = 100;// ϴ���Ǯ
	private final double cutHair = 100;// ������Ǯ
	private final double trimx = 15;// ��ָ�׼�Ǯ
	private final double washEye = 50;// ϴ���
	private final double knot = 50;// ��ë��
	private final double brushTeeth = 10;// ˢ��

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getConsumeType() {
		return consumeType;
	}

	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	public double getTrimx() {
		return trimx;
	}

	public double getWashEye() {
		return washEye;
	}

	public double getKnot() {
		return knot;
	}

	public double getBrushTeeth() {
		return brushTeeth;
	}

	public double getWashPrice() {
		return washPrice;
	}

	public double getCutHair() {
		return cutHair;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public User_MeiRong() {
		super();
	}

}
