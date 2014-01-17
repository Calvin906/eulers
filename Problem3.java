public class Problem3 {
	public static void main(String [] args){
		long  num = 600851475143L;
		long largePrime = 0;
		for( long i = 1; i <= num; i++) {
			if( num % i == 0) {
				if( isPrime(i)) {
					largePrime = i;	
				}
				num = num/i;
			}
		}
		System.out.println(largePrime);
		
	}

	public static boolean isPrime(long x){
		long max = (long)Math.sqrt(x);
		if( x == 2){
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		if (x <= 1) {
			return false;
		}
		for( long i = 3L; i <= max; i+=2 ) {
			if( x % i ==0) {
				return false;
			}
		}
		return true;
	}
}