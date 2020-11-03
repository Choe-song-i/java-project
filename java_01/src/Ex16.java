/*3항 조건연산자 종류)
 * 형식) 조건식?조건식이 참이면 실행: 조건식이 거짓이면 실행;
 * 
 * 삼항조건연산자를 사용하면 코드가 간결해 진다. 하지만 너무 많이 사용하면 읽기가 불편하다.
 * 가독성이 좀 안 좋아진다.
 */
public class Ex16 {

	public static void main(String[] args) {
		int a=5,b=10;
		int max=a;//최대값을 저장할 변수 선언.
		max= a>b?a:b;
		System.out.println("max="+max);

	}

}
