package kr.s18.iostream.serial;

import java.io.FileInputStream; // 파일을 읽어올때
import java.io.FileNotFoundException; // 파일읽을때 기본적으로 예외 생길 수 있는거 처리해야함
import java.io.IOException;
import java.io.ObjectInputStream; // 역직렬화

public class CustomerMain02 {
	public static void main(String[] args) {
		System.out.println("===객체 역직렬화===");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("object.ser"); //object.ser파일 읽어오기
			ois = new ObjectInputStream(fis);
			
			//메소드를 이용해서 객체 복원(역직렬화 수행)
			Customer c = (Customer)ois.readObject(); // readobject가 object타입으로 반환함/ customer 타입으로 변환해야 하니까 다운캐스팅
			//Customer로 다운캐스팅 했을 때 classnotfoundexception 발생 가능성 있다고 try~catch 처리하래서 다중캐치문으로 입력 처리함
			System.out.println(c);
			//customer 클래스에 override했던 형태대로 나옴
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(ois!=null) try {ois.close();} catch(IOException e) {}
			if(fis!=null) try {fis.close();} catch(IOException e) {}
		}
	}
}
