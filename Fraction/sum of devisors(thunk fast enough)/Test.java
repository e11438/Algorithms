
public class Test {
	
//  Return the least power of a that does not divide x.
static int LeastPower(int a,int x)
{
    int b = a;
    while (x % b == 0)
        b *= a;
    return b;
}


//  Return the sum of the proper divisors of x.
static int SumDivisors(int x)
{
    int t = x;
    int result = 1;

    //  Handle two specially.
    {
        int p = LeastPower(2, t);
        result *= p-1;
        t /= p/2;
    }

    //  Handle odd factors.
    for (int i = 3; i*i <= t; i += 2)
    {
        int p = LeastPower(i, t);
        result *= (p-1) / (i-1);
        t /= p/i;
    }

    //  At this point, t must be one or prime.
    if (1 < t)
        result *= 1+t;

    return result - x;
}
	
	
	
	public static void main(String args[]){
		
		System.out.println(SumDivisors(220));
		
	}

}
