import java.util.Scanner;

/*문제) 스캐너로 1~12사이 월만 입력받아서 switch case 문으로 3,4,5,월이면
 * 봄, 6,7,8월이면 여름, 9,10,11월이면 가을, 나머지는 겨울로 출력되게 한다. 단,
 * 1~12월 사이가 아닌경우 if else조건문으로 1월부터 12사이만 입력하세요!라는 경고 메시지를 뛰운다.		
 */
public class Ex2_09 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요");		
		int n1 = Integer.parseInt(scan.nextLine());


		if(1<=n1 && n1<=12) {
			System.out.println(n1+"월은");
			switch(n1) {

			case 3:case 4:case 5:
				System.out.println("봄"); break;
			case 6:case 7:case 8:
				System.out.println("여름"); break;
			case 9:case 10:case 11:
				System.out.println("가을"); break;
			default:
				System.out.println("겨울"); break;
			}	

		}else{
			System.out.println("1월부터 12월 사이만 입력하세요!");	
		}
	}

}
