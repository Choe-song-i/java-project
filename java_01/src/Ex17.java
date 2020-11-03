import java.util.Scanner;

/*자바의 논리연산자 종류)
 * 1.논리연산자 결과값도 true or false 이다.
 * 2.논리연산자 종류)
 * &&(논리곱):입력값 모두 true 인 경우만 참이다.
 * ||(논리합):입력값 중 한개라도 true이면 결과값은 true이다.
 * 모두 거짓인경우만 결과값이 거짓이다.
 * !(논리부정):입력값이 true이면 결과값은 false 이고, 입력값이 false임녀 결과 
 * 값은 true이다.
 */
public class Ex17 {

	public static void main(String[] args) {
	int a=19;
	String s="몰라";
	s=(a>=10 && a>=19)?"10대":"10아님";
	System.out.println(a+"=>"+s);
	System.out.println("=======================");
//age변수값이 10이상이고 19이하이면 참이어서 10대 문자열이 result변수에 저장됨
	/*문제) java.util패키지 풀더의 scanner클래스를 사용하여 자기 나이를 입력받아서
	 * 삼항조건연산자를 사용하여 20대이다. 20대가 아니다라고 출력되는 문장을 작성한다.
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("나이는?");
	String age01=scan.nextLine();//문자열로 입력받는다.
	try {
	
	int age02=Integer.parseInt(age01);//parseInt()메서드에 의해서 정수숫자로 바꾼다.
	
	String age03=(age02>=20 && age02<=29)? "20대":"20대아니다";
	 System.out.println(age01+"세는"+age03);
	
	} catch(Exception e) {
		System.out.println("나이는 숫자만 입력하세요!");
		return;
		}
	/*try~catch문)
	 * 1.try{정상코드 실행되다가 오ㅖ외가 발생하면 catch블록문으로 실행 순서가 옮겨진다.
	 * }catch(예외 처리클래스){
	 * 예외처리하고 종료;
	 * }
	 * return은 종료, Exception은 예외처리 클래스
	 */
	
	}


}
