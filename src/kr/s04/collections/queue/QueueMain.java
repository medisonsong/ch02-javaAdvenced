package kr.s04.collections.queue;

import java.util.LinkedList; //list적인 특성도 있고 queue적인 특성도 있음

public class QueueMain {
	public static void main(String[] args) {
		String[] array = {"서울", "부산", "대구", "광주", "인천"};
		
		//queue: 선입선출 FIFO(First-In First-Out) 자료 구조
		LinkedList<String> queue = new LinkedList<String>();
		
		//객체 저장 / stack->push/ queue->offer
		for(int i=0; i<array.length; i++) {
			queue.offer(array[i]);
		}
		
		//요소의 목록 출력
		System.out.println(queue);
		System.out.println("--------------------------");
		
		while(queue.peek() != null) {//peek 은 queue에 저장된 첫번째 요소를 검색하는 거임 (boolean타입으로 출력)
			//큐에 저장된 첫번째 요소를 반환하고 큐에서 제거
			System.out.print(queue.poll() + "\t");
		}
		System.out.println("\n--------------------------");
		System.out.println(queue);
	}
}
