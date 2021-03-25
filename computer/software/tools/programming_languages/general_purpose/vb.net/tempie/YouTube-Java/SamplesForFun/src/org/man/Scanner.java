package org.man;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Scanner {
	
	String ramoun = rand();
	public void start() {
		BigDecimal xyz = new BigDecimal(22.9);
		timer();
		int i = 0;
		while (true) {
			if (ramoun.equals("Ramoun")) {
				System.out.println(ramoun);
				break;
			}
			ramoun = rand();
			i++;
			System.out.println(xyz);
		}
		System.out.println(i);
	}
	
	
	
	static Random gen = new Random();
	public static void main (String args[]) {
		Scanner s = new Scanner();
		s.start();
	}
	
	
	public static String rand() {
		String txt = "" +
					 (char) (gen.nextInt(26) + 'A') +
				     (char) (gen.nextInt(26) + 'a') +
				     (char) (gen.nextInt(26) + 'a') +
				     
				     (char) (gen.nextInt(26) + 'a') +
				     (char) (gen.nextInt(26) + 'a') +
				     (char) (gen.nextInt(26) + 'a') ;
		return txt;
	}
	
	int seconds = 0;
	void timer() {
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				seconds++;
				System.out.println("Seconds Passed: " + seconds);
			}
		};
		
		if (!ramoun.equals("Ramoun")) timer.scheduleAtFixedRate(task,1000,1000);
	}
	
}

