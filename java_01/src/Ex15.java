/*자바의 비교/관계 연산자 종류)
 * 1.비교연산자 결과값은 true or false이다.
 * 2.종류:>(~보다 크다),>=(~보다 크거나 같다),<(~보다 작다), <=(보다 작거나 같다)
 * ,==(같다),!=(같지 않다)
 */
public class Ex15 {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		boolean result=false;
		result=a>b;
		System.out.println(a+">"+b+":"+result);
		
		result=a<b;
		System.out.println(a+"<"+b+":"+result);
		
		System.out.println(a+b > a-b);
		System.out.println("========================");

	}

}
