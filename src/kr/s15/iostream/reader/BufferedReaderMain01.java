package kr.s15.iostream.reader;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null; // 선언+초기화
		try {
														//System.in> 바이트스트림(1byte)/ 표준 입력
									//inputstreamreader> 바이트스트림(1byte) -> 문자스트림 (2byte)
			//inputstreamreader가 linebyline으로 처리할 수 있는게 없어서 bufferedreader한테 보냄
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("당신의 이름: ");
			String name = br.readLine(); //그래서 bufferedreader가 readLine으로 처리
			System.out.println(name);
			
			System.out.print("당신의 나이: ");
						// int  <=====   string (numberformatexception 예외 발생 가능성 유)
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}catch(IOException e) {
			System.out.println("입력 시 오류 발생");
		}finally {
			//자원정리
		}if(br!=null) try {br.close();} catch(IOException e) {}
			//파일에서 데이터를 많이 받는 경우에는 자원정리를 하는게 맞는데(좋은데) 콘솔에서 조금씩만 입력받는 경우는 생략해도 됨 굳이라는 느낌
		
	/*
	 *								 문자스트림 <--- 바이트스트림 (표준입력)
	 * br = new BufferedReader(new InputStreamReader(System.in));
	 * readline 항상 ioexception 예외 가능성이 있기 때문에 의무적으로 try catch 해야함
	 * 					String->  int 로 변환하는 것이기 때문에 numberformatexception 발생가능성 유
	 * int age = Integer.parseInt(br.readLine());
	 * 그래서 다중 catch문으로 만들었음
	 */
	}
}
