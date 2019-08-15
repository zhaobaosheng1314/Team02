package zsdp.entity;

/**
 * ����ʳƷ��
 * 
 * @author admin
 *
 */

public class Food {

	private String shopName;// ��Ʒ��
	private double price; // �۸�
	private String shopType;// ʳƷ����
	private int amount; // ���
	private double weight; // ���������
	private String consumeType = "����ʳƷ";// ��������

	public Food() {
		super();
	}

	public Food(String shopName, double price, String shopType, int amount, double weight) {
		super();
		this.shopName = shopName;
		this.price = price;
		this.shopType = shopType;
		this.amount = amount;
		this.weight = weight;
	}

	// @Override
	// public String toString() {
	// return "Food [shopName=" + shopName + ", price=" + price
	// + ", shopType=" + shopType + ", amount=" + amount + ", weight="
	// + weight + "]";
	// }

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
