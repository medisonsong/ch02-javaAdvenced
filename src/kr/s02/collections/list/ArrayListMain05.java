package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // int -> Integer
		list.add(20); 
		list.add(15);
		list.add(16);
		
		//요소의 명세 출력
		System.out.println(list);
		System.out.println("-----------------------");
		
		//반복문을 이용하여 짝수 데이터 삭제
		//반복문을 이용해서 특정 조건일 때 요소를 삭제할 경우 요소를 삭제하면 인덱스 변동이 생기고,
		//요소가 이동을 하기 때문에 조건 체크를 하지 못하는 요소가 발생할 수 있음.
		//반복문을 이용해서 특정 조건일 때 요소를 삭제하길 원하면 맨 뒤의 인덱스부터 앞으로 이동하면서 조건 체크를 해야
		//모든 요소의 조건 체크가 가능
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)%2==0) {
				list.remove(i);
			}
		}
		System.out.println(list);
		/*
		 * 결과 반환하면 >[20, 15] 라고 나오는데 
		 * [0]  [1]  [2]  [3]
		 * 10   20   15   16
		 * [0]인 10 삭제 -> 배열 한칸씩 앞으로 땡김
		 * 
		 * [0]  [1]  [2]
		 * 20   15   16
		 * [0]인 20 놓치고 1부터 조건 다시 체크 16[2] 삭제했기 때문에 저런 결과가 나옴.
		 * 
		 * 인덱스 변동에 의해서 조건 검증을 못하는 요소가 생길 수도 있기 때문에
		 * 조건체크는 뒤에서부터 하는게 정확함.
		 */
		
	}
}
