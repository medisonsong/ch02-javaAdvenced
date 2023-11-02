package kr.s11.enumtest;

//문자열 상수를 넣어서 숫자 출력할 수 있게 오버라이딩 하는 방법

enum Item2{
	ADD(5), DEL(11), SEARCH(2), CANCEL(22);
	
	//위에서 지정한 상수 값들을 저장하기 위한 공간
	private final int var; // 생성자의 int var가 여기로 들어와서 저장되는거임
	
	//생성자
	Item2(int var){
		this.var = var;
	}
	
	public int getVar() {
		return var;
	}
}

public class EnumMain05 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD); // > 문자 출력
		System.out.println(Item2.DEL);
		System.out.println(Item2.SEARCH);
		System.out.println(Item2.CANCEL);
		System.out.println("--------------------------");
		
		System.out.println(Item2.ADD.getVar()); // > var에 넣어놓은 숫자 출력
		System.out.println(Item2.DEL.getVar());
		System.out.println(Item2.SEARCH.getVar());
		System.out.println(Item2.CANCEL.getVar());
		System.out.println("--------------------------");
		
		//values() 메서드는 열거 타입의 모든 열거 객체들을 배열로 만들어 반환 (EnumMain03에도 나옴)
		//배열로 반환        Item2[] 를 뜻함
		for(Item2 n : Item2.values()) {
			System.out.println(n + ":" + n.getVar());
		}
	}
}
