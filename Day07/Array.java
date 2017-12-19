public class Array{

	public static void main(String[] args){
		
		String mon = "월";
		String tue = "화";
		String wed = "수";
		String thr = "목";
		String fri = "금";
		String sat = "토";
		String sun = "일";
		
		System.out.print(mon);
		System.out.print(tue);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);
		
		System.out.println();
		
		//배열 (Array)
		
		//정적배열
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		for(int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i]);
		}
		
		System.out.println();
		
		//동적배열 타입[]<<배열 변수명 =  [] 배열 안에 들어가는 숫자를 인덱스라고함
		String[] fruit = new String[3];
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "포도";
		
		for(int i = 0; i < fruit.length; i++ ) {
			
			System.out.println(fruit[i]);
			
		}
		
		// 2차원 배열
		// 정적배열
		String[][] person= {
				{"홍길동", "서울", "남"}, 
				{"홍길순", "부산", "여"}
			};
		
		String res1 = person[0][0]; // 홍길동
		String res2 = person[0][1]; // 서울
		String res3 = person[1][2]; // 여자
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		for(int i = 0; i < person.length; i++){
			
			for(int j = 0; j < person[i].length; j++){
				
				System.out.println(person[i][j]);
				
			}
		
		
		}
		
		//동적배열 (과일 - 이름, 품질, 개수, 맛)
		String[][] fruitArray = new String[3][4];
		fruitArray[0][0] = "귤";
		fruitArray[0][1] = "상";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "새콤달콤";
		
		fruitArray[1][0] = "사과";
		fruitArray[1][1] = "중";
		fruitArray[1][2] = "25";
		fruitArray[1][3] = "상큼";
		
		fruitArray[2][0] = "배";
		fruitArray[2][1] = "하";
		fruitArray[2][2] = "1";
		fruitArray[2][3] = "맛없다";
		
		for(int i = 0; i < fruitArray.length; i++){
			
			for(int j = 0; j < fruitArray[i].length; j++){
				
				System.out.println(fruitArray[i][j]);
				
			}
		}
		
			
	}

}