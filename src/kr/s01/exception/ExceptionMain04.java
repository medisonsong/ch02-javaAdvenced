package kr.s01.exception;

import java.io.IOException; //throws가 IOException에 들어있기 때문에 import해야함
import java.io.BufferedReader;
import java.io.InputStreamReader; // BufferedReader를 통해서 입력받아야되는데 그러려면 InputStreamReader가 필요해서 같이 생성한거임

public class ExceptionMain04 {
	/*
	 * throws 예약어의 사용
	 * method 에 throws 예외 클래스를 명시하면 메서드 내에 try~catch 블럭을 생략할 수 있고,
	 * 예외가 발생하면 예외를 보관해서 메서드를 호출한 곳에 try~catch를 만들었을 경우 그곳으로 예외를 보냄
	 */
	
	public void printData() throws IOException, NumberFormatException{ // throws + 발생할 수 있는 예외 기재
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력:");
					//string->int
		int dan = Integer.parseInt(br.readLine()); // readLine -> 엔터 전까지의 문자를 string형태로 저장함
		System.out.println(dan + "단");
		System.out.println("-------------------");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain04 ex = new ExceptionMain04();
		try {
			ex.printData();
		}catch(IOException e) {
			System.out.println("입력 시 오류 발생");
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}
	}
}

/*
 * throws 사용 시 IOException 내에 있기 때문에 명시
 * 값을 입력할 때 BufferedReader 필요한데 이걸로 값 넣을 때 InputStreamReader가 필요해서 같이 명시함
 * IOException-> readLine 꼭 같이 써야함./ readLine은 무조건 스트링으로 반환함
 * integer.parseint = string -> int
 * 
 * 단, 데이터베이스 연동하는 경우에는 메서드 내에서 try catch 문을 이용함
 */
