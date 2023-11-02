package kr.s01.exception;

import java.util.Scanner;

//사용자 정의 예외 클래스
class NegativeNumberUseException extends Exception{
	public NegativeNumberUseException(String str) {
		super(str);
	}
}

public class ExceptionMain07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0 이상만 입력:");
		try {
			int a = input.nextInt();
			if(a>=0) {
				System.out.println("입력한 숫자 : " + a);
			}else {
				throw new NegativeNumberUseException("음수를 사용할 수 없습니다."); // 0보다 작으면
			}
		}catch(NegativeNumberUseException e) { //negative 어쩌구가 여기로 넘어옴
			System.out.println(e.getMessage()); //음수를 사용할 수 없습니다 문구가 여기서 출력됨.
		}catch(Exception e) { // 다른 예외가 발생했으면 여기로 와서 바로 아랫줄 예외발생 출력
			System.out.println("예외 발생"); 
		}finally {
			if(input != null) input.close(); // null이 아닐 경우에 close 해라 라는 뜻
		}
	}
}

/*
 * exception의 기능을 다 쓸거면 exception쓰면되지 왜 만들었을까?
 * ㄴ NegativeNumberUseException 의 타입(자료형)을 사용하기 위해서..!
 * 
 * 예외 이름들을 축약하지 않고 그냥 다 풀어서 쓴 이유가 얘네 타입 자체가 예외 종류이기 때문에 그렇디
 * try~catch 쓸때도 예외 일어나면 예외 이름들 찾아서 출력했었음
 * 
 * type체크-> catch블럭 이동-> 문구출력
 * 
 */
