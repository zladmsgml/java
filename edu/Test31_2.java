package edu;

import java.util.Scanner;

public class Test31_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		
		  for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				
				System.out.print(i + "*" + j + "=" + (i * j));
				
				System.out.print("\t");

			}
	
			System.out.println("\n");
		}
		
			
	}

}
