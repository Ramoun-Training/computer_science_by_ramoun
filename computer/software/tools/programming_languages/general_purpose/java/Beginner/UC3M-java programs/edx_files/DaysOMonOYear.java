package edx_files;
/* A year is a leap year if:
 *
 *  it is divisible by 4 but not by 100 or
 * 	it is also divisible by 400.
 * 
 * 
 * if (year is not divisible by 4) then (it is a common year)
 * or else if (year is not divisible by 100) then (it is a leap year)
 * or else if (year is not divisible by 400) then (it is a common year)
 * or else (it is a leap year)
 * 
 */
public class DaysOMonOYear {

	public static void main(String[] args) {
		int m = 2;
		int d = 0;
		int y = 2000;

		/*if (m >= 1 && m <= 12) {

			if(m == 4 || m == 9 || m == 6 || m == 11) d = 30;
			else if(m == 2) d = 28;
			else d = 31;

			//if(m == 2 && ((y %4 == 0 && y %100 !=0) || (y % 100 == 0 && y % 400 == 0)))
			if(m== 2 && (y %4 == 0 &&( y %100 !=0 || y % 400==0))){
					d = 29;
			}

			System.out.println("In "+y+", the month "+m+" has "+d+" days");
		}
		else{
			System.out.println("Please Enter a valid month ,'cus<"+m+"> is not a valid one.");
		}*/
		
		//the other way:
		String dr;
		if(y%4!=0)dr="common";
		else if (y%100!=0)dr="leap";
		else if (y%400!=0)dr="common";
		else dr="leap";


	}

}
