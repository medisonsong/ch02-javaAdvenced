package kr.s15.iostream.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedReaderMain02 {
	public static void main(String[] args) {
		FileReader fr = null; // 객체 생성+초기화 / 파일을 읽어오는 역할
		BufferedReader br = null; //라인바이라인으로 읽어오는 역할
		String msg; // 읽어오고 보관할 장소 만들었음
		
		try {
			fr = new FileReader("file.txt"); // file.txt를 읽어오기
			br = new BufferedReader(fr); // file.txt를 bufferedreader로 넘겨주기
			
			//한 라인의 데이터를 읽어들여 변수에 저장
			while((msg = br.readLine()) != null) { // readLine이 null이 아니면 계속 도는거 (readline은 -1이 아니라 null을 반환함)
				System.out.println(msg);
				//readline이 정보처리할때 다음 라인으로 넘어가서 읽을 때 줄바꿈하는 엔터는 제외를 하기 때문에 
				//System.out.println이 대신 줄바꿈을 해줌
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//fr가 먼저 생성, br가 그 뒤에 생성됐으니 br 먼저 정리 후 fr 정리
			if(br!=null) try {br.close();} catch(IOException e) {}
			if(br!=null) try {fr.close();} catch(IOException e) {}
		}
	}
}
//이번 클래스는 문자스트림- 파일로부터 읽어와서 입력작업(라인 단위로) 을 한겁니당