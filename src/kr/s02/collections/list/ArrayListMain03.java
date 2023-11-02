/*
 * ArrayListMain02처럼 하나의 자료형만 넣어서 작업하다가 실수로 다른 자료형 껴넣었을 때
 * 에러나는 것을 어떻게 예방할지 보여주는 예제
 * 입력 시 컴파일 에러가 전혀 안나서 개발자는 다른 자료형을 넣은 줄 모름..!
 */

package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		/*
		 * 제네릭 표현: 객체를 생성할 때 객체에 저장할 수 있는 요소의 타입을 지정하는 것
		 * 객체 생성 시에 값만 넣는게 아니라 값이랑 타입을 같이 전달해서
		 * 다른 타입이 들어왔을 때 user에게 빨간 밑줄을 보여줘서 경고해주는 기능
		 */
		
//		ArrayList list = new ArrayList(); 원래 이렇게 ArrayList를 만드는데
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("하석진"); // String
		list.add("차은우"); // String
		//Arraylist 객체 생성 시 제네릭 표현으로 저장할 요소의 타입을 String으로 지정했기 때문에
		//intiger타입의 데이터를 저장할 수 없음
		//list.add(1000); // Integer 
		list.add("서강준"); // String
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<list.size();i++) {
			//String name = (String)list.get(i); 여기서 string을 지워도 아무 문제가 없음 반환 타입이 string으로 바뀌기 때문에
			String name = list.get(i);
			System.out.println(name);
		}
		
		System.out.println("-------------------------------------");
		
		//확장 for문 사용한 요소의 출력 (배열과 닮아있어서 확장 for문도 사용가능함)
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}

//제네릭 표현을 쓰게 되면 내부적으로 다 제네릭 표현에서 지정한 타입으로 관리되기 때문에 
//출력할 때에도 다운 캐스팅하지 않아도 됨 
//-->제네릭 표현을 쓰면 get메서드의 기본값(object)/ 쓰면 그 쓴 것의 타입으로 바뀜.