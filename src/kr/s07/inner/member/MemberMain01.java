package kr.s07.inner.member;

class Outer{
	//멤버변수
	int x = 100;
	
	//멤버내부클래스 (javawork에 Outer$Inner < 라고 파일이 생기는데 이건 내부클래스라는걸 보여줌
	class Inner{
		int y = 200;
	}
}

public class MemberMain01 {
	public static void main(String[] args) {
		Outer ot = new Outer(); // 외부클래스 객체를 먼저 생성해야 내부 객체를 생성할 수 있음
	// 자료형				//outer 객체에 접근해서 inner 객체 생성
		Outer.Inner oi = ot.new Inner(); // 외부.내부 내부객체이름 = 외부객체이름.내부객체생성();
		System.out.println("x = " + ot.x);
		System.out.println("y = " + oi.y);
	}
}
