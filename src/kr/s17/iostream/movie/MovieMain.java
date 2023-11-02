package kr.s17.iostream.movie;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class MovieMain {
	/*
	 * [실습]
	 * 1. 멤버변수: BufferedReader, ArrayList<Movie>
	 * 2. 생성자: BufferedReader, ArrayList<Movie> 생성
	 * 			callMenu 호출
	 * 3. 메서드: callMenu, 영화정보입력(inputMovie), 영화정보출력(printMovie), 파일생성(createFile), 파일읽기(readFile)
	 * 4. 파일 생성 시 > FileWriter, 파일 읽을 때 > FileReader // 둘다 문자 스트림으로 사용 
	 * 
	 * 파일생성< 영화정보출력 그 내용을 파일에 기술하면 됨 (라인바이라인으로)
	 * 그 기술된 내용을 파일읽기로 읽어옴
	 */
	
	ArrayList<Movie> list;
	BufferedReader br;
	
	public MovieMain() {
		list = new ArrayList<Movie>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}
	
	public void callMenu()throws IOException {
		while(true) {
			System.out.print("1.영화정보입력, 2.영화정보출력, 3.파일생성, 4.파일읽기, 5.종료 > ");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					inputMovie();
				}else if(num == 2) {
					printMovie();
				}else if(num == 3) {
					createFile();
				}else if(num == 4) {
					readFile();					
				}else if(num == 5) {
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");
			}
		}
	}
	
	public void inputMovie() throws IOException {
		Movie mv = new Movie();
		System.out.print("영화제목: ");
		mv.setName(br.readLine());
		System.out.print("제작연도: ");
		mv.setCreate_year(br.readLine());
		System.out.print("감독: ");
		mv.setDirector(br.readLine());
		System.out.print("배우: ");
		mv.setActor(br.readLine());
		System.out.print("장르: ");
		mv.setGenre(br.readLine());
		System.out.print("상영시간: ");
		mv.setTime(Integer.parseInt(br.readLine()));
		
		list.add(mv);
		System.out.println("영화정보 1건을 저장했습니다.");
	}
	
	public void printMovie() {
		//영화 정보 입력한 게 없을 때 출력한 정보가 없다고 조건문 만들기
		if(list.size()>0) {
			System.out.println("영화 리스트: " + list.size() + "개");
			System.out.println("------------------------------------");
			System.out.println("영화제목\t제작연도\t감독\t배우\t장르\t상영시간");
			System.out.println("------------------------------------");
			
			//확장for문 이용해서 출력
			for(Movie m : list) {
				System.out.print(m.toString()); // Movie에 toString overide한거 있음
				//일일이 하나하나 다 치지 않아도 됨!
			}
			System.out.print("------------------------------------\n");
		}else {
			System.out.println("출력할 영화 정보가 없습니다.");
		}
	}

	//파일생성
	public void createFile() {
		FileWriter fw = null;
		Movie mv = new Movie();
		try {
			fw = new FileWriter("movie.txt");
			fw.write("-----------------------------------------------\n"); 
			fw.write("영화제목\t제작연도\t감독\t배우\t장르\t상영시간\n"); 
			fw.write("-----------------------------------------------\n"); 
			for(Movie m : list) {
				fw.write(m.toString());// Movie에 toString overide한거 있음
				//코드 절약..bb
			}
			fw.flush();
			System.out.println("파일에 영화 정보를 저장했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) try {fw.close();} catch(IOException e) {}
		}	
	}
	
	
	//파일읽기
	public void readFile() {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("movie.txt"); 
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
	}catch(FileNotFoundException e) {
		// e.printStackTrace(); 이건 영문으로 나오고 한글로 출력되게 직접 설정
		System.out.println("생성된 파일이 없습니다");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		if(br!=null) try {fr.close();} catch(IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		new MovieMain(); // 생성자에서 작업
	}
}
