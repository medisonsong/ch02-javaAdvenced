package kr.s02.collections.list3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MemberMain {
	/*
	 * [실습]
	 * 1. 멤버변수: ArrayList<Member>, BufferedReader 지정
	 * 2. 생성자에서 ArrayList, BufferedReader 생성, callMenu 호출
	 * 3. 멤버메서드: callMenu, register(회원 정보 입력), printUserInfo(회원정보출력)
	 */
	ArrayList<Member> list; // 얘는 private 붙여도 되고 안붙여도 되고 그럼 
	private BufferedReader br;
	
	//생성자
	public MemberMain() {
		list = new ArrayList<Member>();
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
			System.out.print("1. 회원정보 입력 2. 회원정보 출력 3. 종료> ");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num==1) {
					register();
				}else if(num==2) {
					printUserInfo();
				}else if(num==3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");
			}
		}
	}
	
	public void register() throws IOException{
		Member m = new Member();
		System.out.print("이름: ");
		m.setName(br.readLine());
		
		//나이는 1살 이상
		m.setAge(parseInputData("나이: "));
		
		
		System.out.print("직업: ");
		m.setJob(br.readLine());
		System.out.print("주소: ");
		m.setAddress(br.readLine());
		System.out.print("전화번호: ");
		m.setPhone(br.readLine());
		
		list.add(m);
		System.out.println("회원 정보 1건이 입력되었습니다.");
	}
	
	//나이 체크
	public int parseInputData(String item)throws IOException{
		while(true) {
			System.out.print(item);
			try {
				int age = Integer.parseInt(br.readLine());
				if(age <= 0) {
					System.out.println("1살 이상 입력 가능");
					continue;
				}
				return age;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
				//나이 문자를 잘못 입력했을 때 다시 첫 메뉴로 돌아가는게 아니라 나이부터 다시
			}
		}
		
	}
	
	public void printUserInfo() {
		System.out.println("회원리스트: 총 회원 수 (" + list.size() + ")");
		System.out.println("회원명\t나이\t직업\t주소\t전화번호");
		System.out.println("------------------------------------");
		
		//확장for문 사용해서 출력
		for(Member mb : list) {
			System.out.printf("%s\t", mb.getName());
			System.out.printf("%d\t", mb.getAge());
			System.out.printf("%s\t", mb.getJob());
			System.out.print(mb.getAddress() + "\t"); // 라고 해도됨
			System.out.printf("%s\n", mb.getPhone());
		}
		System.out.print("------------------------------------\n");
	}
	public static void main(String[] args) {
		new MemberMain(); //생성자 호출
	}
}
