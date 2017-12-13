public class TestDrive {
	
	public static void main(String[] args) {
		
		Board n1 =
			new Board(1, "등업부탁드립니다.", "안녕하세요.", "홍길동", "2017-12-13" );
		Board n2 =
			new Board(2, "저도 등업 부탁드려요.", "반갑습니다.", "박지성", "2017-12-11");
		Board n3 = 
			new Board(3, "정회원 부탁드립니다.", "내용없음", "차범근", "2017-12-10");
			
			
		String result1 = n1.printBoard();
		System.out.println(result1);
		
		String result2 = n2.printBoard();
		System.out.println(result2);
		
		String result3 = n3.printBoard();
		System.out.println(result3);
		
	}
	

}