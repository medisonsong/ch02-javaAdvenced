package kr.s08.inner.local;

public class LocalMain01 {

	//멤버 메서드
	public void innerTest() {
		//로컬내부클래스
		class Inner{
			public void getData() {
				System.out.println("Local내부클래스");
			}
		}
		//로컬내부클래스 객체 생성 + 메서드 호출을 해줘야 메모리에 올라가서 실행이 됨
		Inner i = new Inner();
		i.getData();
	}
	
	public static void main(String[] args) {
		LocalMain01 lo = new LocalMain01();
		lo.innerTest();
	}
}
