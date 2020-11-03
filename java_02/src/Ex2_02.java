import java.util.Scanner;

/*if조건문)
 * if(조건문){
 * 조건식이 참일때 실행;
 * }
 * 
 * if~else 조건문)
 * if(조건식){
 * 조건식이 참일때 실행;
 * }else{
 * 조건식이 거짓일때 실행;
 * }
 * {}을 블록문을 하는 이유는 실행문장이 한줄 이상인경우 묶어주기 위해서 이다.
 * 실행문장이 한줄인 경우는 {}중괄호 블록문을 해도 되고 안해도 된다. 가독설(프로그램
 * 코드를 읽는 능력을 뜻함) 때문에 한줄인 경우도 되도록이면 {}중괄호를 하는 것이 좋다.
 */
public class Ex2_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
/* hava.util패키지 폴더의  Scanner클래스를 임포트 즉 읽어들이기 위해서는 이클립스 단축키
 * ctrl+shift+o를 사용한다.
 *
 */
		System.out.println("정수 숫자 입력>>");
		int num=Integer.parseInt(scan.nextLine());//문자열로 읽어들인
		//숫자를 parseInt()메서드로 정수 숫자로 변경
		
		if(num<0) {
			num= -num;// 음수이면 양의 절대값을 구함
		}
		System.out.println("절대값="+num);
		System.out.println("===================");
		
		if(num % 2 == 1) {
			System.out.println(num+"은 홀수 입니다.");
		}else {
			System.out.println(num+"은 짝수입니다.");
			
		}
		
		
		
		}

	}


