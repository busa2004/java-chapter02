package chapter02;

public class ArrayUtil {

	public static double[] intToDouble( int[] source ) {
		double[] arr = new double[source.length];
		for(int i = 0 ; i < source.length;i++) {
			arr[i] = source[i];
		}
		return arr;
	}
	public static int [] doubleToInt( double[] source ) {
		int[] arr = new int[source.length];
		for(int i = 0 ; i < source.length;i++) {
			arr[i] = (int)source[i];
		}
		return arr;
	}
	public static int [] concat( int[] s1, int[] s2 ) {
		int [] arr = new int[s1.length+s2.length];
		for(int i = 0;  i< s1.length; i++) {
			arr[i] = s1[i];
		}
		for(int i = 0;  i< s2.length; i++) {
			arr[i+s1.length] = s2[i];
		}
		return arr;
		//
	}
	
}
