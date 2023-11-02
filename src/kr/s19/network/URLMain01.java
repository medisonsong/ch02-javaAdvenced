package kr.s19.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			//실제 존재하냐 안 존재하냐는 중요하지 않음 
			//형식에 맞으면 객체 생성 가능하기 때문에(접속은 그 다음 문제)
			//포트 기재안했찌만 기본적으로 80포트로 인식하기 때문에 에러 안남
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("포트 : " + url.getPort()); // 명시를 안했기 때문에 알 수 없어서 -1 나옴
			System.out.println("기본 포트 : " + url.getDefaultPort());
			System.out.println("패스 : " + url.getPath());
			System.out.println("쿼리 : " + url.getQuery()); // name > 식별자 kim > 값/ 쿼리= 식별자와 값의 쌍
			System.out.println("ref : " + url.getRef());
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
