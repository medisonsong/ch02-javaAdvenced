package kr.s05.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		//HashSet : 중복값을 불허
		String[] str = {"Java", "JSP", "Java", "Oracle"};
		
		HashSet<String> hs = new HashSet<String>();
		//확장 for문을 이용해서 배열의 요소 호출
		for(String n : str) {
			hs.add(n); // 중복 불허
		}
			
		//저장된 요소의 목록 출력
		System.out.println(hs); //출력결과> [Java, JSP, Oracle]
		System.out.println("-------------------");
		
		//저장된 요소 출력
		Iterator<String> ir = hs.iterator(); // hashset 안에 iterator 메서드가 있음 
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("--------------------------");
		
		//확장for문을 이용한 요소 출력
		for(String s : hs) {
			System.out.println(s);
		}
		
	}
}
//hashset은 인덱스가 없어서 메서드 형태로 뽑아내야함
//set구조는 바구니 형식처럼 생겼는데 iterator 객체를 이용해서 그곳으로 옮긴 후에 뽑아내는 형식임 

//hash set 특징
//데이터를 뽑아내는 방법>
//1. hashset 내 iterator 메서드에 안에 있는 데이터들을 복사함
//2. while문을 이용해서 반복해서 데이터를 출력함
//확장 for문도 지원해주기 때문에 그것도 사용 가능