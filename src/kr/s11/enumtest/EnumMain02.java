package kr.s11.enumtest;

//열거형은 상수를 가지고 생성되는 객체
//lesson 하위에 접근해서 만들어지는 문자열 java,jsp,oracle은 상수가 된다 / lesson.jsp 이런식으로
enum Lesson{
	JAVA,JSP,ORACLE
}
//이렇게 열거형 함수로 만들면 애들이 다 객체로 만들어짐. 열거형 상수 객체라고 함 
//그래서 얘네도 객체기 때문에 메서드를 가지고 있음

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.ORACLE);
		System.out.println("--------------------------");
		
		//열거 객체의 문자열을 반환 (상기 코드 출력 결과랑 동일함)
		System.out.println(Lesson.JAVA.name()); // name자체가 문자열을 반환함
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.ORACLE.name());
		System.out.println("--------------------------");
		
		//열거 객체의 순번(0부터 시작)을 반환
		System.out.println(Lesson.JAVA.ordinal()); // 0 > 입력 순서대로 만들어지기 때문에 자바부터 0 1 2
		System.out.println(Lesson.JSP.ordinal()); // 1
		System.out.println(Lesson.ORACLE.ordinal()); // 2 
	}
}
//enum 체계에선 문자열을 작업하는게 가장 간단하고 베스튼데 숫자를 넣고싶다 하면 좀 복잡해짐(코드를 작성해야함)
