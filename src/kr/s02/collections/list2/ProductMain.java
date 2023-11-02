package kr.s02.collections.list2;

//scanner보다 bufferedreader를 더 많이 씀
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//범용적으로 많이 쓰이기도 하고 앞으로는 이 형식을 쓴다 하시니까 외우기

public class ProductMain {
		ArrayList<Product> list; //주소 저장하기 위해서 멤버변수로 만들었음
		BufferedReader br; //주소 저장하기 위해서 멤버변수로 만들었음
		
		//생성자
		public ProductMain() {
			list = new ArrayList<Product>();
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				callMenu(); // 메뉴호출에서 예외 발생 시 catch블럭으로 이동
			}catch(Exception e) {
				e.printStackTrace(); // printStackTrace : 콘솔에 에러 문구 출력해줌
			}finally {
				if(br != null)try{br.close();}catch(IOException e) {}
			}
			
		}
		
		//메뉴 호출
		public void callMenu() throws IOException{ //ioexception은 입출력에 관련된 예외라서 한번 발생하면 입력을 계속 못받을 수도 있기 때문에 위로 빼서 종료를 시켜버린거임
			while(true) {
				System.out.print("1.상품입력,2.상품목록보기,3.종료>");
				try {
					int num = Integer.parseInt(br.readLine()); 
					//readline 을 string형태로 받기 때문에 예외가 발생할 수도 있어서 trycatch라인 넣음
					// ioexception이 발생할 가능성이 있어서 빨간 선이 그여짐
					//그래서 throws로 ioexception을 위에 올려줌
					if(num==1) { //상품 입력
						input();
					}else if(num==2){//상품 목록 보기
						output();
					}else if(num==3){//종료
						System.out.println("프로그램 종료.");
						break;
					}else {//잘못 입력
						System.out.println("잘못 입력했습니다.");
					}
					
				}catch (NumberFormatException e) {
					System.out.println("숫자만 허용!!");
				}
				
			}
		}
		//callmenu에서 input이 호출되면 입력 output이 호출되면 출력임
		
		//상품 정보 입력
		public void input() throws IOException {
			Product p = new Product();
			System.out.print("상품명:");
			p.setName(br.readLine()); //빨간 줄이 그여서 의무적으로 throw를 하거나 trycatch를 해야함
			System.out.print("상품번호:");
			p.setNum(br.readLine());
			System.out.print("가격:");
			p.setPrice(Integer.parseInt(br.readLine()));
			System.out.print("제조사:");
			p.setMaker(br.readLine());
			System.out.print("재고수:");
			p.setStock(Integer.parseInt(br.readLine()));
			
			//product를 하나하나 하지않고 그냥 arraylist에 한번에 보관
			//상품 정보를 하나만 입력하는게 아니기 때문에
			list.add(p);
			
			System.out.println("상품 정보 1건이 입력되었습니다.");
		}
		
		//상품 정보 출력
		public void output() {
			System.out.println("상품리스트: 총 상품 수(" + list.size() + ")");
			System.out.println("상품명\t상품번호\t가격\t제조사\t재고수");
			System.out.println("-------------------------------");
			//확장for문 사용
			for(Product pt : list) {
				System.out.printf("%s\t", pt.getName());
				System.out.printf("%s\t", pt.getNum());
				System.out.printf("%,d원\t", pt.getPrice());
				System.out.printf("%s\t", pt.getMaker());
				System.out.printf("%,d%n", pt.getStock());
			}
			System.out.println("-------------------------------");
		}
		
		//main의 역할을 줄이기 위해서 생성자 역할을 많이 줌.
		public static void main(String[] args) { //main은 무조건 생성자 호출
			new ProductMain();
	}
}

//사회에서도 거의 단일화된 패턴을 사용해서 업무를 하기 때문에 그냥 핵심적인 패턴 하나 만들어서 다양하게 활용하는게 좋음.

/*
while문에서 버퍼 돌면서 메뉴 보여줌
1. 상품입력 2.목록 3. 종료
//메뉴 호출 주석 아래 
try {
int num = Integer.parseInt(br.readLine());
여기서 메뉴 숫자 입력받는데 
while문 안에서 if문으로 조건식을 걸었기 때문에 
나머지는 조건식대로 출력되고, 숫자가 아닌 문자열을 입력하면 
예외가
}catch (NumberFormatException e) {
System.out.println("숫자만 허용!!");
}
여기로 던져져서 숫자만 허용이라는 문구 출력됨
*/