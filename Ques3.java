package ThreadDemo1;

import java.util.Arrays;


public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]iarr= {49,478,421,658};
		Character[]carr= {'a','c','Z','b','k','m','y','r'};
		findlargest(iarr);
		findlargest(carr);
	}
	
	
	 public static < E > void findlargest( E[] inputArray ) {
		 
		Arrays.sort(inputArray, 0, inputArray.length);
		
		System.out.println("largest in "+inputArray.getClass().getSimpleName()+" is: "+inputArray[inputArray.length-1]);
		System.out.println();
	 }

}