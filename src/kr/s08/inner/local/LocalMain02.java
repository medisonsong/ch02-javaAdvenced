package kr.s08.inner.local;

public class LocalMain02 {

	//멤버메서드
	public void innerTest(int a) { // 로컬 내부 클래스에서 언제든 호출할 수 있게 하기 위해 자동변환으로 a가 상수로 바꼈기 때문
		//a가 지역변수에서 자동으로 상수화되기 때문에 값을 변경할 수 없음 
		//암묵적으로 앞에 finally이 생략되어있음 b포함.
		
		//a의 값을 변경
//		a = 500;
		
		int b = 200;
		//b가 지역변수에서 자동으로 상수화되기 때문에 값을 변경할 수 없음
		//b의 값을 변경
//		b = 10;
		
		//로컬 내부 클래스
		//로컬내부클래스가 포함된 메서드의 지역변수를 로컬내부클래스에서
		//가져다 쓰게 하기 위해 지역변수를 상수화함. 따라서 상수화된 값은
		//변경 불가능
		
		class Inner{
			public void getData() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				//a=100;
				//b=200;
				//상수화되어 변경 불가능 
			}
		}
		//로컬내부클래스 객체 생성
		Inner i = new Inner();
		i.getData();
	}
	
	public static void main(String[] args) {
		LocalMain02 lo  = new LocalMain02();
		lo.innerTest(70);
	}
}
