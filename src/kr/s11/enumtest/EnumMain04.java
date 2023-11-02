package kr.s11.enumtest;

enum Gender{
	MALE, FEMALE;

	//object의 toString 재정의
	@Override
	public String toString() {
		switch(this) {
		case MALE:
			return "남자";
		default: 
			return "여자";
		}
	}
	
}
public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		System.out.println("-------------------------");
		
		System.out.println(Gender.MALE.toString());
		System.out.println(Gender.FEMALE.toString());
	}
}
//enum 문자열 변환하는 방법 중에 제일 간단함