package kr.s02.collections.list4;

import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ScoreMain {
/*
 * [실습]
 * 1.멤버변수: ArrayList, BufferedReader 객체를 저장할 수 있는 변수
 * 2.생성자: ArrayList, BufferedReader 객체 생성, callMenu() 호출
 * 3.메서드: 메뉴(callMenu), 성적입력(inputScore), 성적출력(printScore)
 * 			성적조건입력체크(int parseInputData(String course))
 * 
 */
	
	ArrayList<Score> list;
	BufferedReader br;
	
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1. 성적입력 2. 성적출력 3. 종료>");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num==1) {
					inputScore();
				}else if(num==2) {
					printScore();
				}else if(num==3) {
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용됩니다");
			}
		}
	}
	
	public void inputScore() throws IOException{
		Score s = new Score();
		System.out.print("이름: ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어: "));
		s.setEnglish(parseInputData("영어: "));
		s.setMath(parseInputData("수학: "));
		
		list.add(s);
		System.out.println("정보 1건이 입력되었습니다.");
	}
	
	//나이 체크
	public int parseInputData(String course)throws IOException{
		while(true) {
			System.out.println(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num>100) 
					throw new ScoreValueException("0부터 100까지의 값만 인정");
				
					return num; // if 문 뒤 {} 가 있는데 수행문이 하나라 생략함
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력하세요");
				}catch(ScoreValueException e) {
					System.out.println(e.getMessage());
			}
		}
	}
	
	//성적 출력
	public void printScore() {
		System.out.println("총 학생 수 ("+ list.size() + ")");
		System.out.println("------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		
		for(Score sc : list) {
			System.out.printf("%s\t", sc.getName());
			System.out.printf("%d\t", sc.getKorean());
			System.out.printf("%d\t", sc.getEnglish());
			System.out.printf("%d\t", sc.getMath());
			System.out.printf("%d\t", sc.makeSum());
			System.out.printf("%,2f\t", sc.makeAvg());
		}
		System.out.println("-----------------------\n");
	}
	
	public static void main(String[] args) {
		new ScoreMain();
	}
}
