
public class Ex04 {

	public static void main(String[] args) {
		byte a=1;
		short b=128;
		int c=32768;
		b=a;//1바이트 크기인 byte자료형이 2바이트 크기인 short형으로 자동형변환
		System.out.println(b);
		
		b=(short)c;//4바이트 int형이 더 작은 크기 short형으로 변환할려고
		//(short)라는 명시적인 캐스팅(형변환) 연상자를 사용하여 강제 형변환을 해야
		//한다=>short의 최대값 범위를 벗어나서 최소값 즉 엉뚱한 값이 출력
		System.out.println(b);//오버플로우
	}

}
