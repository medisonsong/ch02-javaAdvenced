package kr.s12.iostream.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; // \가 폴더 구분자 (특문)이라 2개 붙여야함
		
		File f = new File(path); // 실제로 존재하는 경로인지 조건 체크
		
		if(!f.exists() || !f.isDirectory()) {
			// exists= 디렉토리 또는 파일이 존재하는가, isDirectory= 디렉토리가 맞는가
			//디렉토리 내 디렉토리가 존재하는거고, 하위 파일이 존재할수가 없기 때문에 디렉토리여야함
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0); // 프로그램 종료
		}
		
		//지정한 경로의 하위 경로와 파일 정보를 File배열로 반환
		File[] files = f.listFiles();
		for(int i=0; i<files.length; i++) {
			File f2 = files[i];
			if(f2.isDirectory()) { //디렉토리
				System.out.println("["+f2.getName()+"]"); // 디렉토리라면 이름만 명시
			}else {//파일
				System.out.print(f2.getName());
				System.out.printf(" (%,dbytes)%n", f2.length()); // length -> 여기선 파일 용량을 구함 (byte단위로 변환)
			}
		}
	}
}



