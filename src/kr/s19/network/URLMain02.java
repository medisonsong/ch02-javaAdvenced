//네이버를 접근해서 html 테그를 뿌려보좌

package kr.s19.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain02 {
	public static void main(String[] args) {
		String address = "https://www.naver.com"; // /index.html없어도 서버에서 자동으로 찾음 (있어도 되고 없어도 되는,.?)
		BufferedReader br = null;
		String line; // 라인바이라인으로 받기위해 저장소
		
		try {
			URL url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			//원래는 system.in을 넣었는데 url.openStream을 하면 (url이 가지고 있는 기본메서드) > 그 url의 기본 정보 받아옴
			
			while( (line=br.readLine()) != null ) {
				System.out.println(line);
			}
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}
}
