package Fibonacci;

public class Fibonacci {
	public int process(int n) {
		if (n < 2) {
			return n;
		} else
			return process(n - 1) + process(n - 2);

	}

}
