import java.util.Scanner;

public class Ex2_07 {

	public static void main(String[] args) {
/*문제) 스캐너로 1~12사이 월만 입력받아서 if else if 다중 조건문으로 3,4,5,월이면
 * 봄, 6,7,8월이면 여름, 9,10,11월이면 가을, 나머지는 겨울로 출력되게 한다. 단,
 * 1~12월 사이가 아닌경우 if else조건문으로 1월부터 12사이만 입력하세요!라는 경고 메시지를 뛰운다.		
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요");
		int n1 = Integer.parseInt(scan.nextLine());
		
		
		if(1>n1 || n1>12) {
			System.out.println("1월부터 12사이만 입력하세요!");	
			}else if(n1>=3 && n1<=5) {
				System.out.print(n1+"월은 봄입니다.");
			}else if(n1>=6 && n1<=8) {
				System.out.print(n1+"월은 여름입니다.");
			}else if(n1>=9 && n1<=11) {
				System.out.print(n1+"월은 가을입니다.");
			}else{
				System.out.print(n1+"월은 겨울입니다.");
			}	
		
		
	}

}
