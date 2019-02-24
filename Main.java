package javaniitwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Main {
	public static <T> void swap (T[] a, int i, int j)
	{
		  T t = a[i];
		  a[i] = a[j];
		  a[j] = t;
	}

	public static <T> void swap (List<T> l, int i, int j)
	{
		Collections.<T>swap(l, i, j);
	}

	private static void test() {
		String [] a = {"Hello", "Goodbye"};  
		//Swapping 1nd(index 0) element with the 2th(index 1) element
		swap(a, 0, 1);
		System.out.println("Before exchanging array look like : "+Arrays.toString(a));
		List<String> l = new ArrayList<String>(Arrays.asList(a));
		swap(l, 0, 1);
		System.out.println("After exchanging array look like : "+l);
	}
	public static void main(String args[])
	{
		test();
	}

}