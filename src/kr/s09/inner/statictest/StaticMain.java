package kr.s09.inner.statictest;

public class StaticMain {
	
	// public class StaticInner { // static이 아닐때
	//내부클래스에 static을 명시하면 내부클래스를 감싸고 있는 클래스를
	//객체 생성하지 않고 내부클래스를 직접 객체 생성해서 사용 가능
		public static class StaticInner{ 
		int iv = 200;
		static int cv = 300;
		static void make() {
			System.out.println("하하");
		}
	}
	
	public static void main(String[] args) {
		//StaticMain sm = new StaticMain(); // static이 아니면 이렇게 다 외부까지 생성해야함
		//StaticMain.StaticInner in = sm.new StaticInner();
		//System.out.println(in.iv);
		StaticInner i = new StaticInner();
		System.out.println(i.iv); //인스턴스 변수는 객체 생성 후 호출
		
		//static 변수 
		System.out.println(StaticInner.cv);
		//static 메서드
		StaticInner.make(); // 클래스명.메서드명();
	}
}

/*
 * System.out.println(StaticMain.StaticInner.cv); 이런식으로 다 붙이는게 맞는데
 * 같은 클래스라서 생략함 (static 참고) 
 */
