public class Recurse {

    static long steps = 0;
    public static int Sum(int n) {
	if (n == 0) {
	    return 0;
	} 
	return(n + Sum(n-1));
    }

    public static void printInt(long n) {
	if (n >= 10)
	    printInt(n/10);
	System.out.print( (char) ('0' + n % 10));
    }

    public static long nthFib(int n) {	
	if (n <= 1) {
	    return n;
	} else {
	    steps += 2;
	    return nthFib(n-1) + nthFib(n-2);
	}
    }
    
    public static void main (String[] args) {
	// int s = Sum(10);
	// System.out.println("Sum of first 10 digits is " + s);

	// printInt(23005448321l);
	// System.out.println();
	for (int i = 1; i < 15; i++) {
	    steps = 0;
	    System.out.println("Fib " + i + " is " + nthFib(i) + "\n\tIt took " + steps + " steps.");
	}
	//	int i = 50;
	//	System.out.println("Fib " + i + " is " + nthFib(i) + "\n\tIt took " + steps + " steps.");
    }

}
