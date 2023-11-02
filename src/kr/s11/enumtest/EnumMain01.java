package kr.s11.enumtest;

public class EnumMain01 {
	//enum을 사용하지 않고 static 상수를 사용한 경우
	public static final String JAVA = "JAVA";
	public static final String JSP = "JSP";
	public static final String ORACLE = "ORACLE";
	
	public static void main(String[] args) {
		System.out.println(JAVA); // staitc함수는 같은 클래스에서 호출하면 클래스명 생략 가능 EnumMain01.JAVA
		System.out.println(JSP);
		System.out.println(ORACLE);
	}
}
