package kr.s12.iostream.file;

import java.io.File;
import java.io.IOException;

public class FileMain02 {
	public static void main(String[] args) {
		//절대경로 지정
//		String path = "C:\\javaWork\\sample.txt"; // 전체경로를 자바에서는 절대경로라고 함
		
		//상대경로 지정
		String path = "sample.txt"; // 디렉토리는 안적고 그냥 생성할 파일명만 지정함 (기본디렉터리가 있음)
		
		File f1 = new File(path);
		System.out.println("===파일 생성===");
		try {
			//createNewFile: 제공된 경로를 기반으로 파일 생성. 파일이 생성되면 true를 반환함. 만약 생성되지 않으면 false를 반환함
			//경로가 잘못되면 IOException 발생 (createnewfile은 file 내 메서드임)
			System.out.println(f1.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===파일 정보===");
		System.out.println("절대경로: " + f1.getAbsolutePath());
		System.out.println("상대경로: " + f1.getPath());
		System.out.println("디렉토리명: " + f1.getParent());
		System.out.println("파일명: " + f1.getName());
	}
}
/*
 * f1.createnewfile 만 지정할 시에 ioexception 에러가 떠서 try~catch로 감쌌음.
 * 
 * 절대경로> getAbsolutePath
 * 상대경로> getPath
 * 디렉토리명> getParent
 * 파일명> getName
 * 
 * 기실행한 상태에서 다시 실행하면 createnewfile은 false가 뜸/ 이미 있어서 만들지 못한다는 뜻 (덮어씌우지 않음)
 */
