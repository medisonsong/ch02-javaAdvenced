package kr.s05.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List; //처음부터 list타입으로 넣는 방법 1 list를 import 하깅

public class HastSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) {
			int ir = (int)(Math.random()*45)+1;
			hs.add(ir); // 중복값을 허용하지 않음
		}
		System.out.println(hs);
		
		//HashSet -> Set -> Collection
		ArrayList<Integer> list = new ArrayList<Integer>(hs); 
		
		//오름차순 정렬
		Collections.sort(list);// hashset은 set타입이라 hs를 바로 넣으면 타입이 안맞아서 오류남/ collections는 list타입만 지원
		//그래서 위처럼 set을 arraylist로 변환하고 정렬하는 과정이 필요함 

		//확장 for문을 이용한 요소 출력
		for(int num : list) {
			System.out.print(num+"\t");
		}
		
		//ArrayList가 아니라 List 형식으로 변형시키기 // 이 방법도 많이 씀
		//처음부터 list타입으로 넣는 방법 2 list 객체 생성
		List<Integer> list2 = new ArrayList<Integer>(hs); 
	}
}
// set으로 만들고 arraylist 변형 후 정렬
// 처음부터 list로 만들고 정렬