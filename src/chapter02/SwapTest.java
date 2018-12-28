package chapter02;

public class SwapTest {
public static void main(String[] args) {
	int a= 10;
	int b = 20;
	System.out.println(a+ ":" + b);
	
	swap(a, b);
	
	System.out.println(a+ ":" + b);
	
	Value m = new Value();
	m.value = 10;
	
	Value n = new Value();
	n.value = 20;
	
	System.out.println(m.value + ":" + n.value);
	swap(m, n);
	System.out.println(m.value + ":" + n.value);
	
}
public static void swap(int i, int j) {
	int temp = i;
	i = j;
	j = temp;
	
}

public static void swap(Value i, Value j) {
	int temp = i.value;
	i.value = j.value;
	j.value = temp;
	
}
}
