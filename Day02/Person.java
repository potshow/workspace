class Person {

	//속성
	int headSize;  // 머리크기 (숫자)
	int height;    // 키       (숫자)
	String gender; // 성별     (문자)
	int age;       // 나이     (숫자)
	String 
	name;   // 이름     (문자)
	String family; // 가족     (문자)
	
	
	//생성자 (클래스의 속성값을 초기화해주는 녀으석 constructor)
	public Person(int headSize1, int height1, String gender1, int age1, String name1, String family1) {
		
		//this.가 객체라고 생각하면된다고해요; ㅎㅎ 뭘까요
		//Public에 넣은 값은 우측 headSize에 들어갑니다. 좌측 headSize는 속성 headSize를 뜻합니다.
		this.headSize = headSize1; 
		this.height = height1;
		this.gender = gender1;
		this.age = age1;
		this.name = name1;
		this.family = family1;
		
	}

	//매서드
	
	//무엇을 먹는다 (배부르다, 배고프다)
	String eat(String food)//괄호안에 목적어가 들어간다고 생각하믄됨. 무엇을 하는가. String eat의 String부분이 배부르다, 배고프다의 결과가 들어가는 부분이래
									{
		if (food.equals("빵")) {
			return this.name + "은/는 배부르다.";
		}
		else {
			return this.name + "배고프다.";
		}
	}


	//어디에서 잔다 (꿀잠잤다, 피곤하다)
	String sleep(String where) {
		if (where.equals("땅바닥")) {
			return this.name + "은/는 피곤하다.";
		}
		else {
			return this.name + "은/는 꿀잠잤다.";
		}
		

	}


	//어디위로 걷는다
	void walk(String where) {
		System.out.println(this.name + "은/는" + where +  "위로 걷는다.");
	}
	
	//무엇을 생각한다
	void think(String how) {
		System.out.println(this.name + "은/는 " + how + "을/를 생각한다.");
	}
	
	
}