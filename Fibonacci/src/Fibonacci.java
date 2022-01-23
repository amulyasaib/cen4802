/*
 * Amulyasai Bangaru
 * CEN 4802
 * JAN 20th 2022
 * */

import java.util.*;
import java.io.*;

public class Fibonacci {
	public static int recursiveMethod(int number) {
		//System.out.println(n);
		//if statement for the base value f(0)=1 and f(1)=1
		if(number == 0) {
			return 0;
		}
		else if(number ==1 || number==2){
			return 1;
		}
		
		else {
			return (recursiveMethod(number-1)+recursiveMethod(number-2));
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		System.out.println("The "+number+"th term of the Fibonacci sequence is "+recursiveMethod(number)+".");

	}

}
