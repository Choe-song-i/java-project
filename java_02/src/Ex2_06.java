import java.util.Scanner;

public class Ex2_06 {

	public static void main(String[] args) {
		int score = 0;//점수를 저장하기 위한 변수
		char grade = ' ';//학점을 저장하기 위한 변수, 한칸띄운 ' '로 char단일문자
		//타입 초기화

		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력>>");
		score = Integer.parseInt(scan.nextLine());//입력받은 점수를 정수 숫자로 변경
		/*문제)0~100점사이의 점수가 아닌 경우는 0부터 100사이  점수만 입력하세요
		 * 라는 경고메시지를 출력되게 하고, 0~100사이 점수만 각 학점이 출력되게 한다.	
		 */



		if(score >= 0 &&  score <=100) {
			if(score>=90 ) {
				grade='A';
			}else if(score>=80 && score<90) {
				grade='B';

				/*문제)else if조건식에 논리곱 연산자와 비교관계연산자를 추가해 본다.	
				 * 		
				 */

			}else if(score>=70 && score<80) {
				grade='C';

			}else if(score>=60 && score<70) {
				grade='D';

			}else {//0~59
				grade='F';
			}	
			System.out.printf("입력하신 점수 %d점은 %c학점입니다 \n",score,grade);
		}else {
			System.out.println("0부터 100사이  점수만 입력하세요!");
		}//if else
	}

}


