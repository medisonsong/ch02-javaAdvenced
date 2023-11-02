package kr.s18.iostream.serial;

import java.io.FileOutputStream; // 파일을 만들때 사용
import java.io.IOException;
import java.io.ObjectOutputStream; // 만들어진 파일에 직렬화 수행

public class CustomerMain01 {
	public static void main(String[] args) {
		//직렬화할 객체 생성
		Customer c = new Customer("홍길동");
		
		//직렬화 작업
		System.out.println("===객체 직렬화===");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("object.ser"); // 직렬화할 데이터 저장
			oos = new ObjectOutputStream(fos); // 얘가 직렬화할거임
			oos.writeObject(c); // 객체 직렬화 수행
			
			System.out.println("객체 직렬화가 완료되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) try {oos.close();} catch(IOException e) {};
			if(fos!=null) try {fos.close();} catch(IOException e) {};
		}
	}
}
