//하나의 타입만 저장해서 다운캐스팅까지 해보는 예제

package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동"); // String -> object index[0]
		list.add("장영실"); // String -> object index[1]
		list.add("박문수"); // String -> object index[2]
		list.add("김유신"); // String -> object index[3]
		
		//저장된 요소의 명세
		System.out.println(list);
		System.out.println("--------------------------");
		
		//반복문을 이용한 요소의 출력
		for(int i=0; i<list.size(); i++) {
			String name = (String)list.get(i);
			//get이 object로 반환하는데 String으로 변환시키려면 강제로 바꿔야함
			System.out.println(name);
		}
	}
}

/*
 * 이렇게 하나의 타입만 넣다가 개발자 실수로 다른 타입을 끼워넣게 되면 예외가 생김
 * 편하게 데이터 처리를 할 수 있다는 장점이 있다는 반면에
 * 다른 타입이 끼어들면 너무나 쉽게 에러가 발생해버리는고임~,,
 */
