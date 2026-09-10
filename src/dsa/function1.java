package dsa;
import java.util.*;
import java.util.Scanner;
public class function1 {
	
	       public static void main(String[] args) {

	            for (int i = 1; i <= 10; i++) {
	                sum1();
	            }
	        }

	        static void sum1(){
	            Scanner sc = new Scanner(System.in);

	            System.out.print("enter 1st number:");
	            int num1 = sc.nextInt();
	            System.out.print("enter 2st number:");
	            int num2 = sc.nextInt();
	            int sum = num1 + num2;
	            System.out.println("sum of :" + num1 + "+" + num2 +"=" + sum);

	        }
	    }





