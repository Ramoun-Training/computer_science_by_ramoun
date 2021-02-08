class cryptography {
	public static void main(String[] args) {
		System.out.println(decrypt("TDJTIPX JT UIF HSFBUFTU"));
	}

	public static String crypt(String txt) {
		char[] original = new char[txt.length()];
		char[] decrypted = new char[original.length];
		original = txt.toCharArray();

		for(int i = 0; i < original.length; i++) {
			if (original[i] != ' ') {
				decrypted[i] = (char) (original[i] + 1);
			} else {
				decrypted[i] = original[i];
			}
		}
		return String.valueOf(decrypted);
	}

	public static String decrypt(String txt) {
		char[] original = new char[txt.length()];
		char[] decrypted = new char[original.length];
		original = txt.toCharArray();

		for(int i = 0; i < original.length; i++) {
			if (original[i] != ' ') {
				decrypted[i] = (char) (original[i] - 1);
			} else {
				decrypted[i] = original[i];
			}
		}
		return String.valueOf(decrypted);
	}
}