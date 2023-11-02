package kr.s14.iostream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		//파일을 먼저 만들고 파일 안에 내용 기재할거임
		try {
			//파일에 데이터 출력하는 방식 -> 덮어쓰기
			fos = new FileOutputStream("fileout.txt"); // fileout.txt 파일 생성
			//파일에 데이터 출력하는 방식 -> 이어쓰기
			//fos = new FileOutputStream("fileout.txt", true); // 뒤에 , true 를 붙이면 이어쓰기가 됨
			
			String message = "Hello File! 파일에 내용 기술~~"; // byte[] 로 처리해서 한글안깨지게 파일 안에 내용 넣어야함
					// String -> byte[]
			fos.write(message.getBytes());
			System.out.println("파일을 생성하고 내용을 기술했습니다."); 
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally { 
			// 자원정리
			if(fos!=null) try {fos.close();} catch(IOException e) {};
		}
	}
}
