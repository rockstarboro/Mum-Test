public class prime{

	public static void main(String[] args){
		System.out.println("The primes between 11,29 are " + primeCount(-10, 6));
	}

 	public static int primeCount(int start, int end){

 		int prime=0;

 		for(int i=start; i<=end; i++){
 			if(isPrime(i)==true){
 				prime++;
 			}
 		}

 		return prime;

 	}

 	public static boolean isPrime(int num){

 		boolean ret = false;



 		//1 is not prime.
	    if(num <= 1){
	        return false;
	    }

	    //2 is prime (the only even number that is prime)
	    if(num == 2){
	       return true;
	    }

	    /**
	     * if the number is divisible by two, then it's not prime and it's no longer
	     * needed to check other even numbers
	     */
	    if(num % 2 == 0) {
	        return false;
	    }

	    /**
	     * Checks the odd numbers. If any of them is a factor, then it returns false.
	     * The sqrt can be an aproximation, hence just for the sake of
	     * security, one rounds it to the next highest integer value.
	     */
	    int j = (int)sqrt(num);
	    for(int i = 3; i <= j; i = i + 2) 
	    {
	        if(num % i == 0)
	        {
	        	return false;
	        }
	        
	    }

	    return true;

 	}


 	public static double sqrt(int n) {
        double x;
        double squareroot = n / 2;

        do {
            x = squareroot;
            squareroot = (x + (n / x)) / 2;

        } while ((x - squareroot) != 0);

        return squareroot;
    }

}