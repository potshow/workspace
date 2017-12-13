public class TestDrive {

	public static void main(String[] args) {
		Person sanghoon =
					new Person(10, 177, "남", 32, "정상훈", "A");
					
					
		String result1 = sanghoon.eat("빵");
		System.out.println(result1);
		
		String result2 = sanghoon.sleep("쇼파");
		System.out.println(result2);
		
		sanghoon.walk("도로");
		
		sanghoon.think("여러분");
		
		int result3 = sanghoon.add(5, 7);
		System.out.println(result3);
		
	}

}