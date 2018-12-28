package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName("nikkon");
		goods.setPrice(44000);
		goods.setCountSold(100);
		goods.setCountStock(50);

		System.out.println(
				goods.getName() + ":" + goods.getPrice() + ":" + goods.getCountSold() + ":" + goods.getCountStock());
		
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println(Goods.countOfGoods);
		
		System.out.println(goods.calcDisCountPrice(0.3f));

	}

}
