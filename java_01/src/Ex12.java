
public class Ex12 {

	public static void main(String[] args) {
		float f1 = 1F; //A. 
		float f2 = 1.0;//B.=>1.0은 접미사 D(d)가 생략된 double자료형이다.
		//이것을 float타입 변수f2에 저장할려니 형변환이 안됨.
		float f3 = 'A';//C.=> 'A'는 2바이트 크기인 정수 숫자형 char형이다. 이것을 더큰
		//자료형 float타입 변수에 저장하면 자동형 변환이 된다.
		float f4 = "A";//D.=> 참조 타입과 기본 타입(자료형)간에는 형변환을 할수
		//없다.
		float f5 = 1.0d; //E.=> 1.0d double자료형을 float타입 변수에 저장
		//하는 형변환 안됨.

	}

}
