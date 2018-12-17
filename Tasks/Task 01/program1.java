class Program1 {
	public static void main(String[] args) {
		int sum = 15867;
		int a = (sum/5000);
		int b = ((sum-a*5000)/2000);
		int c = ((sum-a*5000-b*2000)/1000);
		int d = ((sum-a*5000-b*2000-c*1000)/500);
		int e = ((sum-a*5000-b*2000-c*1000-d*500)/100);
		System.out.println("5000 - " + a);
		System.out.println("2000 - " + b);
		System.out.println("1000 - " + c);
		System.out.println("500 - " + d);
		System.out.println("100 - " + e);
	}
}