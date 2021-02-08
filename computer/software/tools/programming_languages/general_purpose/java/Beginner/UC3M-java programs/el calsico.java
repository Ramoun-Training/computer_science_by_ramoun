class clasico {

	public static void main(String[] args) {
		//goals scored
		int goalsBarc = 8;
		int goalsMad = 4;

		//printing the result//always printed
		System.out.println("The results was:");
		System.out.println("Barcelona "+goalsBarc +" - Madrid "+goalsMad);

		//printing other messages depending on goals scored and winning and losing team
		if(goalsMad > goalsBarc){
		    System.out.println("Real Madrid won!");
		    if((goalsMad-goalsBarc) > 3){
		        System.out.println("What a match from Madrid players!");
	    	}
		}
		
		if(goalsBarc > goalsMad){
		    System.out.println("F.C. Barcelona won!");
		    if((goalsBarc-goalsMad) > 3){//smart way to check the difference
		        System.out.println("What a match from Barcelona players!");
	    	}
		}
		
		if(goalsMad == goalsBarc){
		    System.out.println("They are even!");
		}
		//extra printing for celebration
		if((goalsMad> 3) && (goalsBarc > 3)){
		    System.out.println("Both teams scored more than 3 goals!");
		}
		
	}
}
