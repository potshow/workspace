public class TestPuppy {

	public static void main(String[] args){
		
		Puppy A = new Puppy("개1","멍멍이",3,"암");
		Puppy B = new Puppy("개2","멍개",1,"수");
		
		boolean same = A.equals(B);
		System.out.println(same);
		
	}
	
}