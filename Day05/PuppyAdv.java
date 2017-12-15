class PuppyAdv {
	
	String type;
	String name;
	int age;
	String gender;
	
	public PuppyAdv(String type, String name, int age, String gender) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		
	}

	// 연산자 우선순위
	// 0. &&: 논리곱
	// 1.+ - * / 마냥 우선순위가 있다.
	// 2. 1번 == 2번 && 순서로 실행됨.
	
	boolean equals(PuppyAdv as) {
		if (this.type == as.type && this.name == as.name) {
			
			return true;
			
		}
		
		return false;
		
	}

}
