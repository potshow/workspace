class Puppy {
	
	String type;
	String name;
	int age;
	String gender;
	
	public Puppy(String type, String name, int age, String gender) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		
	}
	
	boolean equals(Puppy as) {
		if (this.type == as.type) {
			if (this.name == as.name) {
				return true;
			}
		}
		
		return false;
		
	}

	void hello() {
		
		System.out.println(this.name + " " + this.type + " " + this.age + "살 " + this.gender);
	}
	
}
