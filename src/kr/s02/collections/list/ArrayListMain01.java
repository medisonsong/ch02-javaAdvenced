//arraylist는 주소만 저장 되기 때문에 객체를 만들어서 저장해야함 
package kr.s02.collections.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}
class B{
	@Override
	public String toString() {
		return "B";
	}
}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println("데이터를 넣기 전 요소의 개수 : " + list.size());
		
		//ArrayList에 객체 저장
		list.add(new A()); // A -> Object add는 다 object타입으로 자동 형변환해서 저장
		list.add(new B()); // B -> Object
		list.add("홍길동"); // String -> Object
		list.add(100); // int -> Integer -> Object (wrapper클래스처럼 auto boxing일어나서 integer 이후에 object로 또 변환됨)
		//길이가 가변적인 대신 입력받는 자료형은 다 같아야해서 ! 전달되는 순간에 object로 다 변환돼서 저장됨
		
		//저장된 객체의 명세 출력
		System.out.println(list);
		
		//출력 결과 >> [kr.s02.collections.list.A@28a418fc, kr.s02.collections.list.B@5305068a, 홍길동, 100] 
		//        		     A객체 참조값                           B객체 참조값               
		//홍길동, 100은 toString이 재정의돼서 값이 보이는거임 (저장된 데이터가 보여지도록 toString이 재정의된거임)
		//A의 주소값이 아니라 다른 값을 보고 싶으면 위처럼 A를 오버라이딩하면 됨
		
		//저장된 요소의 개수
		System.out.println("요소의 개수 : " + list.size());
	}
}

/*
 * arraylist 안에 저장 후에 그 안에 있는 메서드/데이터를 사용할 때 다운캐스팅을 해야함. 근데 이게 좀 힘들디..
 * 그래서 다양한 타입을 넣는게 아니라 하나의 배열에 하나의 타입만 넣는거임
 * 그래서 다운캐스팅이 좀 쉬워지게 하는거임 
 * string 타입으로 다 넣는다거나 int 타입으로 다 넣는다거나
 * 다양한 타입을 넣는게 가능하지만 실제 사용할 때에는 하나의 타입만 넣는게 나중에 편하다
 */
