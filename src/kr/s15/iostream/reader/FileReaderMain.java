package kr.s15.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			//문자입력스트림 (2바이트)
			fr = new FileReader("file.txt"); // file.txt의 정보 읽기
			//파일로부터 데이터를 읽어올때 FileReader 를 사용해서 읽어옴
			
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
			while((readChar = fr.read())!=-1) { // readchar에 있는 것들을 다 읽으면 빠져나가는 반복문
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			if(fr!=null) try {fr.close();} catch(IOException e) {}
		}
	}
}
//Hello Java!! 안녕하세요!! 여기는 서울입니다. > 라고 안깨지고 출력됨
//파일로부터 데이터를 읽어올때 FileReader 를 사용해서 읽어옴 (한 글자씩 읽음)
//만약 한 라인단위로 읽고싶다 -> bufferedreader를 사용해야함 readLine << 
//filereader+bufferedreader 연계해서 작업할 수 있음