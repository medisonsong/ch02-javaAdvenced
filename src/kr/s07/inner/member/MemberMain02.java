package kr.s07.inner.member;

class Outer2{
	//멤버변수
	private int x = 100;
	
	//멤버내부클래스
	class Inner2{ //얘는 outer2의 x 변수를 갖다쓸수있음
		private int y = 200;
		
		public void make() {
			System.out.println("x = " + x); //outer2의 멤버변수 호출 가능
			System.out.println("y = " + y);
		}
	}
}

public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		Outer2.Inner2 oi = ot.new Inner2(); // 내부클래스를 객체 생성
		oi.make();
	}
}
