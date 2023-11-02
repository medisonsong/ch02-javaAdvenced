package kr.s12.iostream.file;

import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//상대경로
		String path = "sample.txt"; //원래 파일명 (중요함)
		String new_path = "example.txt"; // 새 파일명
		
		File f1 = new File(path); // 원래 파일명 지정
		
		System.out.println("===파일명 변경===");
		
		File f2 = new File(new_path); // 새 파일명 지정
		
		//파일명을 변경할 수 있으면 true, 변경할 수 없으면 false 반환
		System.out.println(f1.renameTo(f2)); 
		// true 값이 나오고 ch02 프로젝트에 refresh 또 눌러보면 파일명이 변해있음!
	}
}
