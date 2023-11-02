package kr.s12.iostream.file;

import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		//생성할 디렉토리 지정
		String path = "C:"+File.separator+"javaSample\\"; // 끝 디렉토리 생략 가능 javaSample 라고만 쳐도됨
		// File.separator: OS가 기본적으로 사용하는 디렉토리 구분자를 읽어옴 \\ 는 윈도우 전용이라 호환성이 높게 만들려면 separator 사용해야함
		
		System.out.println("===디렉토리 생성===");
		File f1 = new File(path);
		
		//디렉토리를 생성할 수 있으면 생성 후 true 불가능하면 false 반환
		System.out.println(f1.mkdir()); // mkdir: 디렉토리 생성
		
		//실행해보면 C:\에 javaSample 이라고 디렉토리 생성됨
	}
}