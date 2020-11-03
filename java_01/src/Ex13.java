/*자바의 수학/한술 연산자 종류)
 * 1.+:덧셈,-:뺄셈
 * 2./:나눗셈. 주의할 것은 정수 숫자를 나눗셈하면 몫만 구하고 실수 숫자를 나눗셈
 * 하면 몫과 나머지를 함께 구한다.
 * 3. *:곱셈,%:나머지 
 */
public class Ex13 {

	public static void main(String[] args) {
		int re=0, a=10, b=3;
		re=a+b;
		System.out.println(a+"+"+b+"="+re);
		re=a-b;
		System.out.println(a+"-"+b+":"+re);
		re=a*b;
		System.out.println(a+"*"+b+":"+re);
		re=a/b;
		System.out.println(a+"/"+b+":"+re);
		
		double c=10.0; int d=4;
		double result=c/d;//실수 숫자를 나눗셈 하면 몫과 나머지를 함께 구함.
		/*double c/ int가 되면 자동산술법에 의해서 bouble c/double d가 되어서
		 * 나눗셈 결과값도 double타입이다. 그래서 몫과 나머지를 함께 구한다.
		 */

		
		System.out.println("result :"+result);
		re=a%b;
		System.out.println(a+"%"+b+":"+re);




	}

}