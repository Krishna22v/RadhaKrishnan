package Week4day2;

import java.util.Scanner;

public class PrimeumL {
public static void main(String[] args) {
	Scanner scr =new Scanner(System.in);
	for (int k = 0; k<100; k++) {
		
	System.out.print("satrt ");
	int a=scr.nextInt();
	System.out.print("End ");
	int b=scr.nextInt();
	for (int j = a;j<=b; j++) {
		
		int num = j;
		int count=0;
		for (int i = 1; i <=num; i++) {
			
			if (num%i==0){
			count++;
		}
		}
		if (count==2) {
	System.out.print(" "+num);
		}
		}
	System.out.println(" ");
	}

		
}
} 
