package kr.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) {
		int var = 50;
		
		//다중 catch문
		//예외가 발생하면 예외객체가 전달되는 catch블럭으로 이동해서 수행문 실행
		try {			//string -> int
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			/*
			 * (주의) 다중 catch문을 사용할 때---
			 * Exception과 하위 예외 클래스를 동시에 명시할 때는 하위 예외 클래스를
			 * 먼저 명시하고 가장 뒤에 Exception을 명시해야 동작상의 문제가 발생하지 않음
			 */
		}catch(ArrayIndexOutOfBoundsException e) { //데이터가 없을 시
			System.out.println("입력한 데이터가 없습니다."); 
		}catch(NumberFormatException e) { //문자 입력 시
			System.out.println("숫자가 아닙니다."); 
		}catch(ArithmeticException e) { // 나눌 인수 0 입력 시
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e) {
			System.out.println("나머지 예외는 여기로~~");
		} // 순차적으로 실행하기 때문에 하위객체 위로 상위객체 밑으로 입력해야함
		//Exception e가 위에 명시한 에러들 제외한 모든 exception을 의미하기 때문
		System.out.println("프로그램 종료!");
	}
}

//run as >  arguments에 여름 넣으면 여름/n프로그램 종료! 가 정상적으로 출력됨
//if문처럼 오류가 있으면 입력한 데이터가 없습니다 라고 나오고, 에러가 없으면 정상적으로 출력이 됨 
//try로 들어갔다가 오류 있으면 catch 블럭으로 들어가는거임 
/*
 * ArrayIndexOutOfBoundsException 데이터 X
 * NumberFormatException 연산 수행문에 문자 입력
 * ArithmeticException 나눌 인수에 0 입력 
 */
