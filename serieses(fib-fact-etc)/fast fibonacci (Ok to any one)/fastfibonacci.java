/* 
 * Demonstration of fast Fibonacci algorithms
 * 
 * Copyright (c) 2015 Project Nayuki
 * All rights reserved. Contact Nayuki for licensing.
 * http://www.nayuki.io/page/fast-fibonacci-algorithms
 */

import java.math.BigInteger;


public final class fastfibonacci {
	
	// Tests the speed of the 3 Fibonacci algorithms
	public static void main(String[] args) {
		// Handle arguments
		
		int n =2 ;
		
		long startTime;	
		
		startTime = System.nanoTime();
		BigInteger y = fastFibonacciMatrix(n);
		//System.out.println("Fast matrix:  ms"+(System.nanoTime() - startTime) / 1000000);
		System.out.println(y);
	
	}
	
	
	/* 
	 * Fast doubling method. Faster than the matrix method.
	 * F(2n) = F(n) * (2*F(n+1) - F(n)).
	 * F(2n+1) = F(n+1)^2 + F(n)^2.
	 * This implementation is the non-recursive version. See the web page and
	 * the other programming language implementations for the recursive version.
	 */
	
	private static BigInteger fastFibonacciMatrix(int n) {
		BigInteger[] matrix = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
		return matrixPow(matrix, n)[1];
	}
	
	// Computes the power of a matrix. The matrix is packed in row-major order.
	private static BigInteger[] matrixPow(BigInteger[] matrix, int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
		while (n != 0) {  // Exponentiation by squaring
			if (n % 2 != 0)
				result = matrixMultiply(result, matrix);
			n /= 2;
			matrix = matrixMultiply(matrix, matrix);
		}
		return result;
	}
	
	// Multiplies two matrices.
	private static BigInteger[] matrixMultiply(BigInteger[] x, BigInteger[] y) {
		return new BigInteger[] {
			multiply(x[0], y[0]).add(multiply(x[1], y[2])),
			multiply(x[0], y[1]).add(multiply(x[1], y[3])),
			multiply(x[2], y[0]).add(multiply(x[3], y[2])),
			multiply(x[2], y[1]).add(multiply(x[3], y[3]))
		};
	}
	
	
	/* 
	 * Simple slow method, using dynamic programming.
	 * F(n+2) = F(n+1) + F(n).
	 */
	public static BigInteger slowFibonacci(int n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return a;
	}
	
	
	// Multiplies two BigIntegers. This function makes it easy to swap in a faster algorithm like Karatsuba multiplication.
	private static BigInteger multiply(BigInteger x, BigInteger y) {
		return x.multiply(y);
	}
	
}