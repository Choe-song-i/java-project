import java.util.Scanner;
public class Ex2_05 {

	public static void main(String[] args) {
/*문제)Scanner로 읽어들인 숫자를 if else 조건문을 사용하여 입력한 숫자가 0인지
 * 0이 아닌지 판별하는 프로그램을 작성하자.
 */
		Scanner scan=new Scanner(System.in);
		
		System.out.print("숫자 입력하시오");
		int a =Integer.parseInt(scan.nextLine());
		if(a==0) {
			System.out.print(a+"는 0 입니다.");
		}else { 
			System.out.print(a+"는 0이 아닙니다.");
		}
		System.out.print("==============================");
		System.out.print("숫자 입력하시오");
		int b =Integer.parseInt(scan.nextLine());
		if(b!=0) {
			System.out.print(b+"는 0이 아닙니다.");
		}else { 
			System.out.print(b+"는 0 입니다.");
		}
	}

}
