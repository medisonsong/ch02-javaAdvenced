package kr.s12.iostream.file;

import java.io.File;

public class FileMain04 {
	public static void main(String[] args) {
		//파일 삭제
		
		//상대경로 지정
		String path = "example.txt";
		
		File f1 = new File(path);
		
		System.out.println("===파일 삭제===");
		//delete() : 삭제할 수 있으면 삭제 후 true 반환, 불가능하면 false 반환
		if(f1.delete()) {
			System.out.println(f1.getName() + " 파일 삭제");
		}else {
			System.out.println("파일을 삭제하지 못했습니다.");
		}
	}
}
/*
 * <file 클래스> 
 * 파일 생성> createNewFile()
 * 파일 변경> renameTo()
 * 파일 삭제> delete()
 * 파일 내 내용 생성은 못함
 */
