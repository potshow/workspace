public class Movie {

	public static void main(String[] args){
		
		int[][] seats = {	{0, 0, 0, 0},
							{0, 1, 0, 0},
							{0, 0, 1, 0},
							{0, 0, 1, 1}	};
			

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		if ( seats[i][j] == 0 ) {
			
			System.out.println("예약가능");
			
		}
		
		else if ( seats[i][j] == 1) {
			
			System.out.println("예약불가");
		
		}

		
	}

}
