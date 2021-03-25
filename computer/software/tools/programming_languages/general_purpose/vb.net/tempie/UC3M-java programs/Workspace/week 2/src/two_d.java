class arrithmatic_methods {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("add:"+add(3,4));
		System.out.println("subtract:"+subtract(3,4));
		System.out.println("multiply:"+multiply(3,4));
		System.out.println("divide:"+divide(3,4));
		System.out.println("modulu:"+modulu(3,4));
	}
	static int subtract(int m,int n) {
		n=-n;
		int r=add(m,n);
		return r;
	}
	static int add(int m,int n) {
		return m+n;
	}
	static int multiply(int m, int n) {
		int i=m;
		int j=0;
		for(;i!=0;i--) {j=add(j,n);}
		return j;
	}
	static int divide(int m, int n) {
		int i=m;
		int j=0;
		for(;i>=n;j++) {i=subtract(i,n);}
		return j;
	}
	static int modulu(int m,int n) {
		int i=m;
		int j=0;
		for(;i>=n;j++) {i=subtract(i,n);}
		return i;
	}

}
