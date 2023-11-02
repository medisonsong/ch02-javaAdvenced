package kr.s02.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 1~45까지 중복되지 않는 6개의 숫자를 구해서 ArrayList에 저장하고 출력하시오
		 * 출력할 때는 오름차순 정렬하여 출력하시오.
		 * 
		 * 힌트 -> 중복값을 알아내는 방법: arraylist contains 이용해서 알아내기
		 * while문을 통해서 6개가 되면 빠져나가면 됨
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		
		while(true) {
			for(int i=0; i<6; i++) {
				list.add(random.nextInt(45)+1);
				if (list.contains(list)) {
					break;
				}
			}
			for(int num : list) {
		}
		System.out.println(list.get(0));
	}
}
}
//와 손도 못댐..
/*
 * 선생님 코드
 * ArrayList<Integer> list = new ArrayList<Integer>();
 * Random ra = new Random();
 * while(list.size()<6){
 * 		int num = ra.nextInt(45)+1;
 * 		//중복값 체크
 * 		if(!list.contains(num)){
 * 		//요소가 중복되지 않으면 저장
 * 			list.add(num);
 * 		}
 * 	}
 *
 * 	//오름차순 정렬
 * Collections.sort(list);
 *  //확장 for문 이용해서 출력
 *  for(int num : list){
 *  	System.out.print(num+"\t");
 * }
 * 
 */
