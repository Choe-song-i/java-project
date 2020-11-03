
public class Ex05 {

	public static void main(String[] args) {
		/*자바의 실수 숫자 자료형 예약어 종류)
		 * 1.float :  4바이트 크기, 값뒤에 접미사 f(F)가 붙는다.
		 * 2.double : 8바이트, 값 뒤에 접미사 d(D)가 붙는다. 일반적으로  D는 생략한다.
		 */
		float a=23.6f;
		double b=2.36;
		
		System.out.println(a);
		System.out.println(b);
		/*자바의 단일문자 자료형 )
		 * char 단 하나의 문자만 작은 따움표로 감싸고 저장되는 값은 십진수 정수로 저장됨.
		 */
		char x='A';
		System.out.printf("%c => %d\n",x,(int)(x));
		//printf()메서드는  jdk1.5에서 다양한 출력형태를 지정해서 출력하고, c언어에
		//가져온 메서드이다. %c는 단일 문자 출력형태, %d는 심진수 정수 출력형태,
		//\n은 이스케이프 문자로서 출력할때 줄바꿈(개행)한다.
	

	}

}
