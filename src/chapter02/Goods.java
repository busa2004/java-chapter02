package chapter02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	public static Goods getInstance() {
		
		return new Goods();
	}
	
	public static int countOfGoods;
	public Goods() {
		countOfGoods ++;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(countStock);
		System.out.println(countSold);
	}
	
	public int calcDisCountPrice(float discountRate) {
		
		return price - (int)(price * discountRate);
		
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price != -1) {
		this.price = price;
		}
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	

}
