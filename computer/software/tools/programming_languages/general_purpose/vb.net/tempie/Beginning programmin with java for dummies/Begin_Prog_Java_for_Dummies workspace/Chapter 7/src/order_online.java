
public class order_online {

	public static void main(String[] args) {
		double pay=5.02;
		double shipping=25,discount=(23/100)*pay;
		
		pay+=shipping;
		pay-=(discount*2);//pay=pay-discount*2;
	}

}
