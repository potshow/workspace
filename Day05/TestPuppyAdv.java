public class TestPuppyAdv {
	
	public static void main(String[] args){
		
		PuppyAdv one = new PuppyAdv("러시안블루", "고양이", 1, "암");
		PuppyAdv two = new PuppyAdv("러시안블루", "고양이", 5, "수");
		
		boolean bigyo = one.equals(two);
		System.out.println(bigyo);

		
		if (bigyo) {
			
			System.out.println("같은 강아지이다.");
			
		}
		
		else {
			System.out.println("다른 강아지이다.");
			
		}
		
		
	}
	
}