package src;

public class 실습_배열 {

	public static void main(String[] args) {
		String[] names = {"홍길동","김유신","계백","강감찬","을지문덕"};
		String[] subjs = {"수학","국어","영어","과학","역사"};
		int[] criteria = {50,60,70,80,80};
		int[][] scores = {{85,90,78,88,92},{75,80,85,90,95},{65,70,75,80,85},{95,92,88,84,91},{88,76,85,79,90}};
				
		
		for(int i=0; i < names.length; i++) {
			System.out.println("["+names[i]+"]");
			for(int j=0; j<subjs.length; j++) {
				String result = (scores[i][j] >= criteria[j])? "통과":"과락";
	
				System.out.print(subjs[j]+ " : "+ scores[i][j]+ " => " +result );
				System.out.println();
				
				
			}
			
		}
	}

}


