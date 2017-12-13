class Board {

	int no; //글번호
	String title; //제목
	String content; //내용
	String name; //작성자
	String regDate; //작성일
	
	
	public Board(int no, String title, String content, String name, String regDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.name = name;
		this.regDate = regDate;
	}

	
	String printBoard() {
		return this.no + " " + this.title + " " + this.content + " " + this.name + " " + this.regDate;
	}
}