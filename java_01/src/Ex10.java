//3장 pt 강의교안 3번 문제 풀이
public class Ex10 {

	public static void main(String[] args) {
	byte var1=127;
	short var2=128;
	int var3=128;
	long var4=128L;
	var4=var1;//byte형이 long타입으로 자동형변환을 한다.
	System.out.println("var1 = "+var1+"var2 = "+var2);
	//var1=()var3;//4바이트int형이 1바이트 byte형으로 자동형 변환을 못함=>
	//캐스팅 연산자를 사용하여 명시적인 형변환
	var1=(byte)var3;//byte형으로 명시적인 형변환을 해도 byte형 범위를 벗어나
	//원하지 않는 값이 저장됨.
	System.out.println("var1:"+var1+"var3:"+var3);//-128,128
	
	//float var5=123456.789123;//float타입 값뒤에 접미사 F(f)가 붙어야 한다.
	float var5=123456.789123f;
	double var6=123456.789123;
	//var5=var6;//8바이트 double타입 실수자료형이 4바이트 float 실수 숫자형으로
	//자동형 변환을 못함.
	var5=(float)var6;
	System.out.println(var5+","+var6);
	var6=var5;//자동형변환
	System.out.println(var5+","+var6);

	}

}
