package edu;

public class Test30_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) {

				if ((i % 3) == 0) {
					System.out.println(i +"는 2와 3의 배수입니다.");
					j++;
				}
				
				
			}
		}
		System.out.println("2와3의 공배수는" + j +"개 입니다.");
	}

}
