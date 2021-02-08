import java.util.Random;
public class random_number126 {

	public static void main(String[] args) {
		Random random_number=new Random();
		int i=0;
		int random;
		
		while(i<30) {//checking "not in this chapter"
			random=random_number.nextInt();
			random=random<0?-random:random;
			random=random%6+1;
			System.out.println(random);
			i++;
		}

	}

}
