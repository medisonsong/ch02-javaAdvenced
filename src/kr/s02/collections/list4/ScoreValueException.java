package kr.s02.collections.list4;

//사용자 정의 예외 클래스 (성적은 0~100만 가능/ 나머지는 예외 처리)
public class ScoreValueException extends Exception{
	public ScoreValueException(String message) {
		super(message);
	}
}

//catch블럭에 ScoreValueException 넣으면 됨.