public class Repeat {
	
	public static void main(String[] args){
		//for(초기값;반복하는 조건문;증가값) {중가로안에 반복할내용 집어넣음}
		for (int i = 0; i < 10; i++) {
				System.out.println("Hello World");
		}
		//args 배열 내용을 출력
		for (int i = 0; i < args.length; i++) {
				System.out.println(args[i] + "번째 입니다.");
		}
	}


}