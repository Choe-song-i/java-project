import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		
		System.out.printf("%d + %d= %d\n",a,b,a+b);
		//%d출력형태는 십진수 정수, \n은 줄 바꿈
		System.out.printf("%d - %d= %d\n",a,b,a-b);
		System.out.printf("%d * %d= %d\n",a,b,a*b);
		System.out.printf("%d / %d= %d\n",a,b,a/b);
		//정수 숫자를 나눗셈하면 몫만 구함.
		System.out.printf("%d %% %d= %d\n",a,b,a%b);
		System.out.println("=====================");
		
		
		
		/*문제)값을 범위를 벗어난 44가 출력된다. 맞는 값이 출력되도록 수정하고 값을 범위를 벗어
		 * 난 이유에 대해서 기술한다.(주석문으로 처리)
		 */
		byte c=10,d=30;
		int result=c*d;
		System.out.println("result : "+result);
		/*1. byte*byte는 int*int로 형변환되어서 솝셈을 한다. 그러므로 곱셈결과값은 4바이트형이다.
		 * int형이다. int타입 변수 result에 저장해서 출력하면 된다.
		 * 
		 * 2. int*int한 300을 byte형으로 명시적인 형변환을 하면 byte형 자료범위를 벗어나고,
		 * 4바이트가 1바이트로 축소되어서 300을 이진수 0,1로 변환했을때 앞자리수 이진수가 잘린다.
		 * 그래서 자료손실이 발생해서 44가 된다.
		 */
		
		
		System.out.println("숫자를 입력하시오");
		Scanner scan=new Scanner(System.in);
		String n01=scan.nextLine();//숫자 입력받는다.
		
		
		int n02=Integer.parseInt(n01);//parseInt()메서드에 의해서 정수숫자로 바꾼다.
		
		String n03=( 1 == n02%2 )? "홀수이다.":"짝수이다.";
		 System.out.println(n01+"숫자는"+n03);
		
	}

}
