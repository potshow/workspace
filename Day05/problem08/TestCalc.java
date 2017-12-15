public class TestCalc {

	public static void main(String[] args){
		
		Calc A = new Calc ();
		
		
		int AA = A.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(AA);
		
		int VV = A.sub(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(VV);
		
		int DD = A.mul(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(DD);
		
		int FF = A.div(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(FF);
	}

}