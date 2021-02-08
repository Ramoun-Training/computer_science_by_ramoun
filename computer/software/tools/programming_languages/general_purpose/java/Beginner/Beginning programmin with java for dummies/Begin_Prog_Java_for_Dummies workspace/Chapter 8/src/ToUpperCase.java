public class ToUpperCase {
/*
 * java uses camel naming to name methods
 */
	public static void main(String[] args) {
		char character='r';
		String te="characte"+true;
		char text1='a',t2='b',t4='D';
		char small='a',big;
		big=Character.toUpperCase(small);
		char upper_character=Character.toUpperCase(character);
		System.out.println(upper_character);
		System.out.println(Character.toUpperCase(text1));
		System.out.println(Character.toUpperCase(t2));
		System.out.println(te);
		System.out.println(Character.toLowerCase('<'));
		System.out.println(Character.toLowerCase(t4));
		System.out.println(big+" "+small);
	}

}
