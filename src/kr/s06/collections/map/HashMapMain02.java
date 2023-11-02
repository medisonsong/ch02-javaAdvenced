package kr.s06.collections.map;

import java.util.HashMap;
import java.util.Iterator; // 한꺼번에 key 구할 때 iterator, set 필요
import java.util.Set; 

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin", "Paris", "Seoul", "NewYork", "London"};
			//	key		value						key		value
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//hashmap에 key와 value 저장
		for(int i=0; i<msg.length; i++) {
			map.put(i, msg[i]);
		}
		
		//저장된 key와 value의 목록 출력
		System.out.println(map);
		System.out.println("--------------------");
		
		/*
		//hashmap은 key만 단독으로 구하는 메서드가 없기 때문에 set객체의 힘을 빌려야함
		Set<Integer> s = map.keySet(); // map.keyset이 map이 가지고 있는 key를 s에 다 넣는거임
		Iterator<Integer> keys = s.iterator();
		*/
		Iterator<Integer> keys = map.keySet().iterator(); // 아까 위에 방법은 s를 한번만 쓰고 안써서.. 더 효율적으로 쓸 수 있는 방법
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key + ", " + map.get(key));
		}
		// map -> set -> 그럼 이제 또 set도 iterator안에 복사해야하니까 set-> iterator임
	}
}
