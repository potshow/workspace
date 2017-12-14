public class RepeatPrint {
	
	public static void main(String[] args){
		
		if (args.length == 0) { 
			System.out.println("명령 구문이 올바르지 않습니다.");
			System.out.println("사용법: ");
			System.out.println("java RepeatPrint [-options]");
			System.out.println("-message <출력할 메세지 입력>");
			System.out.println("-repeat <메세지 출력 반복횟수>");
		}
		
		else if (args.length == 2) {
			// <     >.equals(ㅇㅇㅇㅇ)->> < >랑ㅇㅇㅇㅇ에 적힌 문구가 같으면 참이고 그 외에는 거짓이다.. 
			if (args[0].equals("-message")) {
					System.out.println(args[1]);
			}
		
		}
	}

}