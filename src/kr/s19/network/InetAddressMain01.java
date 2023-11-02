package kr.s19.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException; // 도메인명 잘못입력시 발생되는 예외

public class InetAddressMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		InetAddress iaddr = null;
		String url = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//도메인명 입력받기
			System.out.print("도메인명 입력: "); // ex) naver.com
			url = br.readLine();
			
			iaddr = InetAddress.getByName(url);
			System.out.println("호스트 이름: " + iaddr.getHostName()); // 접근하려는 서버의 이름
			//도메인 명이 있을 경우엔 도메인 명으로 출력됨
			System.out.println("호스트 IP주소: " + iaddr.getHostAddress());
			
			System.out.println("---------------------------");
			
			//로컬 호스트 IP주소 구하기
			iaddr = InetAddress.getLocalHost();
			System.out.println("로컬 호스트 이름 : " + iaddr.getHostName());
			System.out.println("호스트 IP주소 : " + iaddr.getHostAddress());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}
}
