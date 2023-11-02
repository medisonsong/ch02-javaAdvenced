package kr.s18.iostream.serial;

import java.io.Serializable;
/*
 * Serializable 인터페이스를 구현하면 해당 클래스는 객체 직렬화 대상이 되어
 * 언제든지 객체 직렬화를 수행할 수 있음
 * 미구현 시 객체 직렬화 불가능
 */

public class Customer implements Serializable { // serializable은 추상메서드가 없음 그냥 직렬화 대상인지 아닌지만 판단함 (추가 메서드 없음)
	private String name; // 직렬화대상 (클래스 정보/ 네임에 저장된 데이터를 직렬화함) 
	
	public Customer(String name) { 
		this.name = name;
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	@Override
	public String toString() {
		return "당신의 이름은 " + name;
	}
	
}
