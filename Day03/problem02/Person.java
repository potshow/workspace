class Person {

	int headsize; 
	int height;
	String gender;
	int age;
	String name;
	String family;
	
	public Person(int headsize, int height, String gender, int age, String name, String family) {
		this.headsize = headsize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
		
	}
	
	
	String eat(String food) {
		if (food.equals("빵")) {
			return "배부르다.";
		}
		else {
			return "배고프다.";
		}
	
	}
	

	String sleep(String where) {
		if (where.equals("땅바닥")){
			return "피곤하다.";
		}
		else {
			return "꿀잠잣다.";
		}
	}
	
	void walk(String where) {
		System.out.println(where + " 위로 걷는다.");
	}
	
	void think(String how) {
		System.out.println(how + "을(를) 생각한다.");
	}
	
	//숫자 A와 숫자 B를 더하는 메서드
	int add(int A, int B) {
		return A + B;
	}
}