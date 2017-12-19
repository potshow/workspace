public class Fruit{

	public static void main(String[] args){
		
		String[][] fruit = new String[3][4];
				
				
		fruit[0][0] = "귤";
		fruit[0][1] = "상";
		fruit[0][2] = "10";
		fruit[0][3] = "새콤달콤";
		
		fruit[1][0] = "사과";
		fruit[1][1] = "중";
		fruit[1][2] = "25";
		fruit[1][3] = "상큼";
		
		fruit[2][0] = "배";
		fruit[2][1] = "하";
		fruit[2][2] = "1";
		fruit[2][3] = "맛없다";
		
		for(int i = 0; i < fruit.length; i++){
			
			for(int j = 0; j < fruit[i].length; j++){
			
				if (i == 0) {
					
					System.out.println("이름 : " + fruit[i][0]);
					System.out.println("품질 : " + fruit[i][1]);
					System.out.println("개수 : " + fruit[i][2]);
					System.out.println("맛 : " + fruit[i][3]);
					
					break;	
				}
				
				System.out.println();
				
				if (i == 1) {
					System.out.println("이름 : " + fruit[i][0]);
					System.out.println("품질 : " + fruit[i][1]);
					System.out.println("개수 : " + fruit[i][2]);
					System.out.println("맛 : " + fruit[i][3]);
					
					break;
				}
				
				
				if (i == 2) {
					System.out.println("이름 : " + fruit[i][0]);
					System.out.println("품질 : " + fruit[i][1]);
					System.out.println("개수 : " + fruit[i][2]);
					System.out.println("맛 : " + fruit[i][3]);
					
					break;
				}
								
			}
		}
		
	}

}