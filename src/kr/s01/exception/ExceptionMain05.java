package kr.s01.exception;

public class ExceptionMain05 {
	public static void main(String[] args) {
		System.out.println("===예외가 발생하지 않았을 경우===");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("프로그램 종료@@");
		
		System.out.println("--------------------------");
		
		System.out.println("===예외가 발생한 경우===");
		
		try {
			System.out.println("1");
			System.out.println(10/0); // 예외 발생 -> 1 3 4 프로그램 종료!! 라고 출력됨
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("프로그램 종료!!");
	}
}

/*
 * try~catch문 + finally > finally가 조건 상관없이 무조건 출력하는 부분을 적으면 되는건데
 * Scanner로 비유하자면 close같은 역할임 다 끊어내서 메모리를 효율적으로 사용할 수 있도록 자원정리 해주는 구문임
 * try와 관계있는 구문-finally 없는 구문-그냥 밖에 입력
*/
