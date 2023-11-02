//arraylist 삭제/ 변경하는 예제
package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서강준"); // index[0]
		list.add("하석진"); // index[1]
		list.add("차은우"); // index[2]
		list.add("한소희"); // index[3]
		list.add("서강준"); // index[4]
		
		//반복문을 이용하여 요소문 출력
		for(int i=0; i<list.size();i++) {
			String name = list.get(i);
			System.out.println(i + " : " + name);
		}
		System.out.println("----------------"); 
		
		//요소의 삭제
		//1) 인덱스를 넣어서 삭제
		//list.remove(2); // index[2] 데이터 삭제
		
		//2) 요소를 넣어서 삭제
		list.remove("서강준");
		//서강준이 index0, index4 두갠데 맨 위에 있는 0번 서강준만 지워짐
		//중복된 데이터가 있으면 동시에 두 개 다 삭제하는 것이 아니라, 앞에서부터 삭제됨
		
		for(int i=0; i<list.size();i++) {
			String name = list.get(i);
			System.out.println(i + " : " + name); // 삭제 후 출력해보면 인덱스가 앞으로 한칸씩 땡겨져있음 (2가 비어있지 않음) --> 인덱스 변동이 생김
		}
		System.out.println("----------------"); 
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(40);
		
		for(int i=0; i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i + " : " + num);
		}
		System.out.println("----------------"); 
		
		//요소의 삭제
		//list2.remove(2); //인덱스
		//Integer은 요소가 숫자라서 요소인지 인덱스인지 구분을 못하기 때문에 그냥 숫자 들어가면 인덱스로 구분함
		list2.remove(Integer.valueOf(40)); // 그렇기 때문에 Integer.valueOf(요소) 라고 해야함 얘도 맨 앞에 있는 40만 지움
		//			요소 int -> integer 변환
		
		for(int i=0; i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i + " : " + num);
		}
		System.out.println("----------------"); 
		
		//요소의 변경
		list2.set(1, 30); // 배열명.set(인덱스, 요소값); > 인덱스 자리에 요소값 넣음 index[1]자리 값이 30으로 바뀜
		
		for(int i=0; i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i + " : " + num);
		}
		
	}
}

/*
 * 정리
 * String 삭제 방법
 * 1) 인덱스 list.remove(2); //index[2] 삭제
 * 2) 요소   list.remove("홍길동"); // 맨 앞에 있는 홍길동 삭제
 * 
 * Integer 삭제 방법
 * 1) 인덱스 list.remove(2); //index[2] 삭제
 * 2) 요소   list.remove(Integer.valueOf(40)); // 맨 앞에 있는 40 삭제 
 * --------------------------------------------------------------
 * 요소의 저장
 * list.add("홍길동"); // add를 넣어서 요소 저장
 * 
 * 요소의 변경
 * list.set(1, 30); // index[1] 자리 값을 30으로 대체
 */
