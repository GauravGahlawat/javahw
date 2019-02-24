package javaniitwork;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

 public static void main(String a[]){
    ArrayList<String> al = new ArrayList<String>();
    al.add("Sachin");
    al.add("Rahul");
    al.add("Saurav");
    al.add("Sunil");
    al.add("Kapil");
    al.add("Vinod");

    System.out.println("ArrayList before Swap:");
    for(String temp: al){
        System.out.println(temp);
    }

    //Swapping 1nd(index 0) element with the 6th(index 5) element
    Collections.swap(al, 0, 5);

    System.out.println("ArrayList after swap:");
    for(String temp: al){
       System.out.println(temp);
    }
  }
}