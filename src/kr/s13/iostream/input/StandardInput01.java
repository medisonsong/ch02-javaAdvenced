package kr.s13.iostream.input;

import java.io.IOException;

public class StandardInput01 {
	public static void main(String[] args) {
		//자바의 기본 입력: 바이트스트림 (1byte 입력)
		
		try {
			System.out.print("영문자 1개 입력:");
			int a = System.in.read();
			//System.in > 입력할 때 사용하는 문구
			//read()> 문자 하나를 입력 받아서 아스키코드로 반환
			System.out.println(a + ", " + (char)a); //  아스키코드를 char로 변환한거 / A 입력 시 65, A라고 나옴/ 한글 넣으면 깨짐
			
			System.in.read(); // enter처리 \r(13) 
			System.in.read(); // enter처리 \n(10) 이렇게 메모리상에 두개 다 넣어서 날려버리는거 (엔터흡수 역할) 
			
			System.out.println("----------------------------");
			System.out.print("숫자 1개 입력:"); //문자로 인식 -> 아스키코드로 출력
			int b = System.in.read() - 48; //숫자처럼 사용하고 싶으면 read() - 48 하면 됨.
			System.out.println(b);
			/*
			 * enter: \r \n으로 이루어져있음 그래서 enter치면 int b = system.in.read()에 자동으로 전달됨
			 * \r이 13번이라서 자동으로 숫자 1개 입력:13라고 출력되는거임 + \n이 자동으로 줄바꿈
			 * 그래서 그 엔터를 흡수하는 구문을 추가해서 날려버리고 번호를 입력할 수 있게 만드는 것 
			 */
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}