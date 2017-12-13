public class TestDrive {
	
	public static void main(String[] args) {
	
	Student A =
				new Student(20141234, "김아무개", 20, "생명공학과", 6);
	Student B =
				new Student(20171324, "박도라지", 28, "경영과", 1);
	Student C =
				new Student(20091545, "최모씨", 24, "유아교육과", 3);
	
	//A.study();
	//B.study();
	//C.study();
	//A.introduce();
	//B.introduce();
	//C.introduce();
	
	String ddd = A.study();
	System.out.println(ddd);
	
	String dddd = B.introduce();
	System.out.println(dddd);
	
	}

}