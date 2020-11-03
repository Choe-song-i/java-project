
public class Ex19 {

	public static void main(String[] args) {
		int a=1000000, b=2000000;
		
		long c=a*b;
/*문제)곱셈 연산 결과값이 int범위를 벗어나서 엉뚱한 값-1454759936
 * 이 출력된다. 맞는 곱셈 결과값이 나오도록 자바 소스를 수정한다.
 * 
 */
		//자바 코드 수정시작
		
	 c=(long)a*b;
		/*long*int는 자동산술법에 의해서 long*long이 된다. 곱셈결과값도 long타입이어서
		 * 범위를 벗어나지 않아서 정상적인 데이터가 c변수에 저장됨.
		 */
		System.out.println(c);
	}

}
