package kr.s13.iostream.input;

import java.io.IOException;

public class StandardInput02 {
	public static void main(String[] args) {
		int input = 0;
		try {
			//명시적으로 -1을 만들려면 콘솔상에서 ctrl+z를 하면 됨 
			while( (input = System.in.read()) != -1 ) {
				System.out.println(input + ", (char)input : " + (char)input); // input=아스키코드 / char)input=문자변환 / 13,10 (엔터까지 나옴)
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		//루프 돌면서 여러 문자 넣을 수 있게 했는데도 불편함 + 1바이트만 가능이라 한글도 깨짐 ㅜ ㅜ(한글은 2바이트)
		//System.in.read 가 표준입력이지만 그동안 scanner, bufferedreader 쓴 이유가 너무 불편해서임
	}
}
