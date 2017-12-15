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
	
	public boolean equals(Puppy as) {
		if (this.type == as.type) {
				if (this.name == as.name)
				return true;
		}
		return false;
		
	}
}