class Student {

	int StudentId;
	String name;
	int age;
	String major;
	int grade;
	
	public Student(int StudentId, String name, int age, String major, int grade) {
		
		this.StudentId = StudentId;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
		
	}
	
	//void study(){
		//System.out.println( this.name + "이(가) " + this.major + " 공부를 한다.");
	//}
	
	String study() {
		return this.name+ "(이)가 " + this.major + " 공부를 한다.";
	}
	
	String introduce() {
		return "저는" + this.major + " " + this.grade + "학년" + " 재학중인 " + this.name + " 입니다.";
	}
	
	//void introduce() {
	//	System.out.println( "저는 " + this.major + " " + this.grade + "학년 재학중인 " + this.name + "입니다.");
	
	//}
}