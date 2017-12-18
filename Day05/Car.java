class Car{

	String brand;
	String color;
	String type;
	int year;

public Car(String brand, String color, String type, int year){
	
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.year = year;
	
	}
	
	
	void start(){
		System.out.println( this.brand + "의" + this.type + this.year + "년식" + " 차에 시동을 건다.");
	
	}	
	
	String gear(int dan) {
		
			if(dan.equals(1)) {
				return "1단 기어로 변환했다.";
			}
			
			else if(dan.equals(2)) {
				return "2단 기어로 변환했다.";
			}
			
			else if(dan.equals(3)) {
				return "3단 기어로 변환했다.";
			}
			
			else if(dan.equals(4)) {
				return "4단 기어로 변환했다.";
				
			}
			
			else return "해당 기어로는 변환할 수 없습니다.";
			
		
	
	}
	
	void open() {
		System.out.println( this.type + "의 " + this.color + "색의 문을 열었다.");
	}
	
	void accel() {
		System.out.println( this.year + "연식의 차를 가속했다.");
	}
}