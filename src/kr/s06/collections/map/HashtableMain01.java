package kr.s06.collections.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableMain01 {
	public static void main(String[] args) {
				// key		value
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "홍길동");
		ht.put("age", "27");
		ht.put("tel", "010-1234-5678");
		ht.put("job", "경찰");
		ht.put("address", "서울시");
		//key, value에 null 불인정
		// ht.put("hobby", null); HashMap은 key,value모두 null 인정했는데 Hashtable은 둘다 null 인정 안함
		// ht.put(null, "300"); 얘는 컴파일 에러는 없고 런타임 에러가 생김
		ht.put("name", "박문수"); // 얘도 hashMap처럼 같은 키를 사용하면 value를 덮어씌움
		
		//저장된 key, value 목록 출력
		System.out.println(ht);
		System.out.println("-------------------------");
		
		String name = ht.get("name");
		System.out.println("이름은 " + name);
		System.out.println("-------------------------");
		
		//Enumeration을 이용해서 key값 한번에 빼내기
		//enumeration이 iterator 같은 역할을 하는거임 / keys라는 메서드 이용해서 enumeration에 복사
		Enumeration<String> en = ht.keys(); // hashtable은 keys라는게 있는데 key를 다 가지고 있는거임
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println("key : " + key + ", value : " + ht.get(key));
		}
	}
}
