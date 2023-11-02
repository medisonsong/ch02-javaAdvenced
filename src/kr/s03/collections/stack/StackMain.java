package kr.s03.collections.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		
		//스택(Stack) : 후입선출 LIFO(Last-in First-out) 방식
		Stack<String> stk = new Stack<String>();
		
		for(int i=0; i<array.length; i++) {
			stk.push(array[i]);
		}
		
		//요소의 목록 출력
		System.out.println(stk);
		System.out.println("---------------------------------------");
		
		//반복문을 이용한 요소의 출력
		while(!stk.isEmpty()) {// 현재 스택이 비어있지 않다면 true임 isempty-> 비면 true 인데 ! 사용해서
			//스택에 저장된 객체를 꺼내오면 저장된 객체는 지워짐
			System.out.print(stk.pop() + "\t");
		}
		System.out.println("\n---------------------------------------");
		System.out.println(stk); //저장되어있는 정보가 있는지 확인
		//근데 꺼내와서 출력할때 스택에 있는 데이터는 지워버리기 때문에 남아있는 데이터는 [] 뿐임.
		
	}
}
