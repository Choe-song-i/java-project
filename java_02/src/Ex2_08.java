/*switch ~case 다중 조건문 형식)
 * switch(정수식){
 * case 값1: 정수식과 값1이 일치하면 실행; break;
 * default: 해당사항 없을때 실행;
 * }
 * break문을 만나면  swtch case 문을 종료한다.
 */
public class Ex2_08 {

	public static void main(String[] args) {
		String nara="Korea";
		char ch=nara.charAt(0);//charAt(0)은 nara변수  Korea의 첫 단일문자만 구함
		
		switch(ch) {
		case 'A':
		case 'a':System.out.println("미국"); break;
		case 'C':case 'c':
			System.out.println("캐나다"); break;
		case 'J':case 'j':
			System.out.println("일본"); break;
		case 'K':case 'k':
			System.out.println("대한민국"); break;
		default:
			System.out.println("해당 나라가 없습니다."); break;
			
			
			
		}

	}

}
