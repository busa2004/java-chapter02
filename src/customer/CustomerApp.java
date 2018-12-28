package customer;

import chapter02.Customer;

public class CustomerApp {
public static void main(String[] args) {
	Customer c= new Customer();
	
	//protected 같은 패키지에서 접근 가능
	//c.name = "둘리";
	
	
	
	//c.age = 10;
	c.setAge(10);
	
}
}
