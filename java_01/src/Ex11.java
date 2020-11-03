//3장 pt 강의교안 6번 문제 풀이
public class Ex11 {

	public static void main(String[] args) {
		
		byte b = 127; 
		byte c = 126; 
		int  d = b + c; 
		/*자바의 자동산술법이란?
		 * 1.자바언어는 연산을 할때 결과값을 잃어 버리는 자표손실을 막기위해서 메모리 크기 더 큰 
		 * 타입으로 자동형 변환을 하게 된다. 이것을 자동 산술법이라고 한다.	
		 * 
		 * 2.자동산술 순서
		 * byte->short(char)->int->long->float->double
		 * 더 큰 오른쪽 자료형으로 자동산술된다.
		 * 
		 * 주의할 것은 boolean 논리타입은 다른 자료형간의 형변환을 할 수 없다. 
		 * 
		 * 결국 byte+byte는 자동산술법에 의해서 int+int가 된다. 결국 결과값은 int타입
		 * 이다.
		 */
		
	System.out.println(d);//253
	}

}
