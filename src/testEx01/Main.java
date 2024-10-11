package testEx01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
				
				 System.out.print("");
				 int width = sc.nextInt();
				 System.out.print("");
				 int length = sc.nextInt();
				 
				 for(int i = 0; i<length; i++) {
					 for(int j = 0; j<width; j++ ) {
						 System.out.printf("*");
					 }
					 System.out.println();
				 }
	}
}
	

	


				 
