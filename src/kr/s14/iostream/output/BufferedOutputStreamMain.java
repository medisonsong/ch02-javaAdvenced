package kr.s14.iostream.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null; //선언
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("bufferOut.txt"); // 파일 만들고 파일 생성 후 그 정보를
			bos = new BufferedOutputStream(fos); // buffered에 보낸거임 (bufferout.txt 정보를 얻게됨)
			
			//파일에 저장할 문자열
			String str = "BufferedOutputStream Test 입니다."; // 스트링 문자열을 byte[]로 변환해서 넣어야함
			
			bos.write(str.getBytes()); // getBytes: String데이터를 byte로 만들어서 write로 전달함
			//파일에 데이터를 올린게 아니라 버퍼에 저장한거라 파일 안에 str 내용이 기술되진 않음
			bos.flush(); // 버퍼를 비우고 버퍼에 있는 데이터를 파일에 출력 (버퍼는 일정 메모리가 차야 버퍼를 비우기 때문)
			//플러시를 하지 않으면 버퍼에 담겨있는 데이터를 파일에 저장하지 않음
			
			System.out.println("파일을 생성하고 파일에 내용을 기술함");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {//fileoutputstream, bufferedoutput 둘다 생성했기 때문에 자원정리 해야되는데 순서가 있음
			//buffered는 fileout의 정보를 갖게되고 자원을 사용하게됨 (+계속 엑세스 중)
			//그래서 buffered를 먼저 끊고 fileoutput을 끊어야함
			//객체 만들어진 역순으로 자원정리를 하는 게 좋음
			if(bos!=null) try {bos.close();} catch (IOException e) {};
			if(fos!=null) try {fos.close();} catch (IOException e) {};
			
			//bos.flush() 실행 후 flush 주석처리하고 다시 한번 더 실행해도 내용 남아있음 
			//bufferedoutputstream의 close 메서드는 자원정리하기 전에 buffer를 체크해서 남아있는 데이터가
			//있으면 자체적으로 flush를 실행함!
		}
	}
}
