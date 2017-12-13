public class TestDrive {
	
	public static void main(String[] args) {
		
		Student A =
					new Student(20142727, "강예은", 23, "유통마케팅과", 2);
		Student B =
					new Student(20142121, "백정학", 28, "영업과", 4);
		Student C =
					new Student(20121234, "이라은", 22, "전기전자과", 2);
					
		
		A.study();
		A.introduce();
		
		B.study();
		B.introduce();
		
		C.study();
		C.introduce();
	
	}

}