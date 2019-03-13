public class Fib2 {

    public static long storage[] = new long[100];

    public static long Fib(int n) {
	if (storage[n] != 0) {
	    return storage[n];
	}
	if (n == 0) {
	    return 0;
	}
	if (n == 1) {
	    return 1;
	}
	storage[n] = Fib(n - 1) + Fib(n - 2);
	return storage[n];
    }

    public static void main(String []args) {
	for (int i = 2; i < 55; i++) {
	    System.out.println(i + ":" + Fib(i));
	}
    }
}
