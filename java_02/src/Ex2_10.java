
public class Ex2_10 {

	public static void main(String[] args) {
		int score=Integer.parseInt("99");
		//"99"문자열을 정수 숫자 99로 parseInt()에 의해서 변경
		System.out.print(score+"점수는");
		score=score/10; //10으로 나눈 몫. 100점과 99점은 몫이 10,9. 정수 숫자나눗셈을 하면 몫만 구함
		char grade=' ';
		switch(score) {
		case 10: case 9:
			grade='A'; break;
		case 8: 
			grade='B'; break;
		case 7: 
			grade='C'; break;
		case 6: 
			grade='D'; break;
			default:
				grade='F'; break;
		}
System.out.printf("%c 학점",grade);
	}

}
