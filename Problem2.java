public class Problem2 {
	public static void main(String [] args) {
		
		int sum = 0;
		int i = 0;
		int x = 0;

		while( x < 4000000 ) {
			x = fib(i);
			if( x % 2 ==0) {
				sum += x;
				
			}
			i++;
			
		}

		System.out.println(sum);

	}

	public static int fib(int x) {

		if ( x ==0) {
			return 1;
		}
		if ( x ==1) {
			return x;
		}

		else {
			return fib(x - 1) + fib(x-2);
		}
	}
}