package Chapter_9;
import java.util.Random;
public class SpecialOfferGift {

	public static void main(String[] args) {
		Random random_generator=new Random();
		
		if(random_generator.nextInt(16)+1 == 16) {
			System.out.println("YOU ARE OUR LUCKY USER YOU GET A GIFT " + (char)2);
		}
		else {
			System.out.println("Sorry,you are unlucky.");
		}
		
	}

}
