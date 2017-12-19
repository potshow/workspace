public class AA{

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
			
				if (j == 0) {		
					System.out.print("이름 : ");			
				}

				
				else if (j == 1) {
					System.out.print("품질 : ");
				}
				
				
				else if (j == 2) {
					System.out.print("개수 : ");
				}
				
				else if (j == 3) {
					System.out.print("맛 : ");
				}
				
				System.out.println(fruit[i][j]);
					
			}
		
			System.out.println();
		}
		
	}

}