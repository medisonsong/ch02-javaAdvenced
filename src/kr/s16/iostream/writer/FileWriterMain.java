package kr.s16.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//문자출력스트림
			fw = new FileWriter("fileWriter.txt"); // filewriter.txt 파일 생성 / filewriter 객체도 덮어쓰기, 이어쓰기 가능
			
			//파일에 저장할 문자열
			String message = "안녕하세요 FileWriter 테스트\n오늘은 수요일" + System.getProperty("line.separator") + "내일은 목요일";
			//\n 윈도우 전용 줄바꿈
			//모든 os호환되는 줄바꿈 처리> System.getProperty("line.separator")
			
			fw.write(message); // getbyte로 바이트를 배열로 바꾸는 그런 과정없이 그냥 바로 처리
			//버퍼에 저장된 데이터를 버퍼를 비우고 파일로 전송
			fw.flush();
			
			System.out.println("파일을 생성하고 내용을 기술함");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) try {fw.close();} catch(IOException e) {}
		}
		
		/*
		 * FileWriter도 기본적으로 buffer지원함 (버퍼활용가능)
		 * 그래서 fw.write(message) -> 버퍼에 message 저장
		 * fw.flush(); -> 버퍼에서 파일로 message 전송 / 실행을 해야 파일 내 저장됨
		 * 
		 * filewriter+bufferedwriter 연계해서 작업 가능한데
		 * 애초에 filewriter가 buffer지원해서 굳이 할 필요가 없음 단독으로도 충분히 사용 가능
		 */
	}
}
