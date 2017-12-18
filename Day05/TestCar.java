public class TestCar {

	public static void main(String[] args){
		
		Car A = new Car("쉐보레", "검정", "스파크", 2016);
		Car B = new Car("현대기아", "화이트펄", "K3", 2014);
		
		
		A.start();
		
		String result = A.gear(5);
		System.out.println(result);
		
		B.open();
		
		B.accel();
	}

}