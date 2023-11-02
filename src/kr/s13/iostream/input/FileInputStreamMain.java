package kr.s13.iostream.input;

import java.io.FileInputStream; // FileInputStream에 inputstream 상속되어있음. 그래서 1바이트 입력처리함
import java.io.FileNotFoundException; // 파일이 없을 경우 생기는 예외
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null; // 메모리를 많이 잡아먹기 때문에 자원정리(finally)필요
		int readbyte;
		byte[] readbyte2;
		
		try {
			fis = new FileInputStream("file.txt"); // 상대경로 명시 (프로젝트에서 파일명입력한걸 찾음,, ch02 이게 프로젝트임)
			//파일의 정보를 한 문자씩 읽어들여 아스키 코드로 반환
			//영문 이외의 문자는 깨짐
			/*
			while((readbyte = fis.read())!=-1) { // read메소드가 한문자씩 읽어와서 readbyte한테 반환. 파일을 읽다가 읽을게 없으면 -1 반환 얘도 IOException 발생이라 try~catch해야함
				System.out.print((char)readbyte);
			}
		*/
			//영문 이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()]; // file에 있는 내용을 읽어서 byte로 환산 -> [] 안에 넣어줌
			
			//파일로부터 읽어들인 데이터를 byte[]에 저장
			//아까 한문자씩 넣던것은 반복문을 통해서 내가 직접 짜서 넣은건데 얜 지 스스로 내부에서 처리해서 넣기 때문에 안해도 됨
			fis.read(readbyte2);
								// byte[] -> String 변환
			System.out.println(new String(readbyte2));
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) { // while문 ioexception 받는 문장
			e.printStackTrace();
		}finally {
			//자원정리 (우리가 소멸시킬 수 없어서 빨리 소멸될 수 있도록(쓰레기 객체가 되도록) 자원을 다 끊어버리는 과정 
			//자원정리 양식은 똑같고 소멸자만 바뀜. 걍 외우기
			if(fis!=null)try {fis.close();}catch(IOException e) {};
		}
	}
}

// 출력하면 한글은 다 깨짐
// 한글(2바이트)을 안깨지게 하려면 바이트 배열로 만들어서 string 으로 빼내야함
