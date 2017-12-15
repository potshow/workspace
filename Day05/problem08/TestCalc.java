public class TestCalc {

	public static void main(String[] args){
		
		Calc A = new Calc ();
		
		
		int result1 = A.add(1, 2);
		System.out.println(result1);
		
		int result2 = A.sub(3, 2);
		System.out.println(result2);
		
		int result3 = A.mul(5, 5);
		System.out.println(result3);
		
		int result4 = A.div(10, 5);
		System.out.println(result4);
	}

}