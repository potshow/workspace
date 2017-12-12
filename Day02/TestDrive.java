public class TestDrive {
	
	//프로그램의 시작점
	public static void main(String[] args) {
		
		// 객체 (Object) : yeEun, sangIl, sangHoon
		Person yeEun = 
						new Person(10, 163, "여", 23, "강예은", "A");
		Person sangIl = 
						new Person(10, 173, "남", 45, "김상일", "B");
		Person sangHoon =
						new Person(10, 177, "남", 32, "정상훈", "C");
	
	
		//내가 빵을 먹는다 객체.매서드("호출값")
		String result1 = yeEun.eat("빵");
		System.out.println(result1);
		
		//상일씨가 침대에서 잔다.
		String result2 = sangIl.sleep("침대");
		System.out.println(result2);
		
		//상훈이가 구름위로 걷는다.
		sangHoon.walk("구름");
		
		//상훈이가 비트코인을 생각한다.
		sangHoon.think("비트코인");
		
	}
	
	
}