import java.util.Scanner;
/*import 예약어는 java.util패키지의 Scanner클래스를 읽어들임.
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*1.5 System.in은 입력장치 키보드와 연결되고 Scanner클래스로 데이터를 읽어들임.
		 * 
		 */
		System.out.println("수강과목(ex:java)=> ");
		String subject=scan.nextLine();//문자열로 읽어들여 좌측 변수에 저장
		
		System.out.println("학생명:");
		String student=scan.nextLine();
		
		System.out.println("나이:");
		String age01=scan.nextLine();
		int age02=Integer.parseInt(age01);//문자열로 입력받은 나이를 parseInt() 메서드에 의해서  정수형 숫자 나이로 변경해서 저장
		
		System.out.println("수강과목:"+subject);
		System.out.println("학생이름:"+student);
		System.out.println("나이:"+age02);
		
	}

}
