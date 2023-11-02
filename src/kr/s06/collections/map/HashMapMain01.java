package kr.s06.collections.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map : key와 value의 쌍으로 데이터 저장
		 */
			  // key	value						key		value
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//key와 value 의 쌍으로 저장
		//		key	  value
		map.put("김신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		//key와 value의 null 인정
		map.put("홍길동", null); // value가 null인 경우 
		map.put(null, 100); // key가 null인 경우
		map.put("지은탁", 0); // 같은 key를 사용하면 value를 덮어씌움
		
		//저장된 key, value 목록 출력
		System.out.println(map); //{저승사자=85, 김신=95, 써니=93, 유덕화=70, 지은탁=100}. map구조는 뒤죽박죽으로 저장이 되어 있어서 정렬이 지맘대로임
		System.out.println("---------------------");
		
		Integer num2 = map.get(null);
		System.out.println("null의 성적은 " + num2); // 홍길동도, null도 오류 안나고 출력됨 
		
		Integer num = map.get("지은탁"); // key가 중복인 경우 마지막에 입력받는 쌍의 value가 기존 value를 덮어 씌움
		System.out.println("지은탁의 성적은 " + num);
	}
}
