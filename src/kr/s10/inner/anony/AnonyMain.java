package kr.s10.inner.anony;

class Inner6{
	public void disp() {
		System.out.println("부모클래스의 disp");
	}
}

public class AnonyMain {

	public void make() {
		//익명내부클래스
		Inner6 i = new Inner6() { // 익명내부클래스는 클래스명이 없어서 그냥 바로 클래스 정의+객체 생성 같이 해버림
		//요 중괄호 안이 클래스 영역임
			@Override
			public void disp() {
				System.out.println("자식클래스의 disp");
			}
		};
		//메서드 호출
		i.disp(); // > 자식클래스의 disp 출력됨
	}
	
	public static void main(String[] args) {
		AnonyMain an = new AnonyMain();
		an.make(); // -> an.make make클래스로 가서 내부클래스에서 객체 생성 후 disp실행 -> 부모클래스의 disp 출력
		//@Override 이후 자식 클래스의 disp가 나옴 (자식 클래스의 재정의가 강력하기 때문에)
	}
}

/*
 * inner가 없어지면 부모클래스의 이름을 자료형/ 생성자명으로 사용해야함 (inner 대신 Inner6)
 * 그래서 부모 영역에 있는 것만 호출이 됨
 * 
 * 타입을 안바꾼 상태에서 자식 메서드를 호출하고 싶으면 재정의를 하면 됨
 * 
 * 그냥 외우는게 마음 편하대용 그냥.. 오ㅣ웁시다 ㅎㅅㅎ
 * ======================================
 * 
 * -내부 클래스만 클래스명을 안써도 되는거임
 * 내부클래스기 때문에 일부러 이름을 없앤거긔 그러고 부모 이름을 갖다쓴거
 * 근데 부모이름을 갖다쓰면 부모 영역에 있는것만 호출가능함
 * 
 * Inner6 i = new Inner6() { 에 대한 서렴ㅇ
 * 클래스명이 없기 때문에 객체 생성 후 생성자 뒤 {} 여기안이 클래스 영역 자리임
 * !!!!!!!! 객체 생성 뒤 세미콜론이 아니라 { } 가 나오면 100% 익명객체임!!!!!!!!!!
 */
