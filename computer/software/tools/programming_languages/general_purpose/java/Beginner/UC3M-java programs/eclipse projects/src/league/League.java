package league;
/*
 * one of the good things is that i forgot to update the total after updating Barcaaway and
 * Madaway (hahahaha very bad error)
 */
public class League {

	public static void main(String[] args) {

				int Barcahome = 1;
				int Barcaaway = 1;
				int Madhome = 1;
				int Madaway = 1;

				int totalBarca = Barcahome + Barcaaway;
				int totalMad = Madhome + Madaway;

				if (totalBarca == totalMad) {
						Barcaaway *= 2;
						Madaway *= 2;
						//this is the step i forgot
						totalBarca = Barcahome + Barcaaway;
						totalMad = Madhome + Madaway;
				}
				//showing the result
				System.out.println("The final result:");
				System.out.println("Barcelona:"+totalBarca);
				System.out.println("Real Madrid:"+totalMad);

				if (totalMad < totalBarca) {
						System.out.println("Barcelona Passes to the next round.");
						System.out.println("CONGRATULATIONS!!");
				}
				else if (totalMad > totalBarca) {
						System.out.println("Real Madrid Passes to the next round.");
						System.out.println("CONGRATULATIONS!!");
				}
				else{
						System.out.println("Both Teams have to play for 30 mins.");
				}
	}

}


/*
//	System.out.println("i think it works yes");
	//goals of Barcelona
		int goalsHomeBarc = 4;
		int goalsAwayBarc = 1;
	//goals of Madrid
		int goalsHomeMad = 2;
		int goalsAwayMad = 3;
	//total goals of both teams
		int totalGoalsMad = goalsHomeMad + goalsAwayMad;
		int totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;

		if(totalGoalsMad == totalGoalsBarc){
				// When the overall result is even,
				//goals scored away count double
				// so we update the goals away for
				//each team and compare again.
				goalsAwayBarc = goalsAwayBarc *2;

				// The 'variable *= X' operator means
				//the same as 'variable = variable * X'
				goalsAwayMad *=2;

				// We calculate again the overall result
				 totalGoalsMad = goalsHomeMad + goalsAwayMad;
				totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;

				// We show the result
				System.out.println("Overall Result is ");
				System.out.print("F.C. Barcelona "+totalGoalsBarc);
				System.out.println(" - Real Madrid "+totalGoalsMad);

				if(totalGoalsMad > totalGoalsBarc){
						System.out.println("Madrid passes the round!");
				}else if (totalGoalsMad < totalGoalsBarc){
						System.out.println("Barcelona passes the round!");
				}
				else{
						System.out.println("every team have to play for more 30 mins.");
				}
		}else{

				// If the overall is not even
				// there is a clear winner.
				System.out.println("Overall Result is ");
				System.out.print("F.C. Barcelona "+totalGoalsBarc);
				System.out.println(" - Real Madrid "+totalGoalsMad);

				if(totalGoalsMad > totalGoalsBarc){
						System.out.println("Madrid passes the round!");
				}else{
						System.out.println("Barcelona passes the round!");
				}
		}
		*/
