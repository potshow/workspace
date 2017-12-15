public class TestPuppy {
	
	public static void main(String[] args){
		
		Puppy one = new Puppy("러시안블루", "고양이", 1, "암");
		Puppy two = new Puppy("샴", "고양이", 5, "수");
		
		boolean bigyo = one.equals(two);
		System.out.println(bigyo);
		
		one.hello ();
		two.hello ();
		
		if (bigyo) {
			
			System.out.println("같은 강아지이다.");
			
		}
		
		else {
			System.out.println("다른 강아지이다.");
			
		}
		
		
	}
	
}