import java.util.Arrays;
import java.util.Scanner;


public class NumOfWaysCoins {
	
	public static int count( int S[], int m, int n )
	{
	    // table[i] will be storing the number of solutions for
	    // value i. We need n+1 rows as the table is consturcted
	    // in bottom up manner using the base case (n = 0)
	    int[] table=new int[n+1];
	 
	    // Initialize all table values as 0
	    //memset(table, 0, sizeof(table));
	    for(int i=0;i<table.length;i++){
	    	table[i]=0;
	    }
	    
	 
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[] values
	    // after the index greater than or equal to the value of the
	    // picked coin
	    for(int i=0; i<m; i++)
	        for(int j=S[i]; j<=n; j++)
	            table[j] += table[j-S[i]];
	 
	    return table[n];
	}
	public static int count2( int S[], int m, int n )
	{
	    int i, j, x, y;
	 
	    // We need n+1 rows as the table is consturcted in bottom up manner using 
	    // the base case 0 value case (n = 0)
	    int[][] table=new int[n+1][m];
	    
	    // Fill the enteries for 0 value case (n = 0)
	    for (i=0; i<m; i++)
	        table[0][i] = 1;
	 
	    // Fill rest of the table enteries in bottom up manner  
	    for (i = 1; i < n+1; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	            // Count of solutions including S[j]
	            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
	 
	            // Count of solutions excluding S[j]
	            y = (j >= 1)? table[i][j-1]: 0;
	 
	            // total count
	            table[i][j] = x + y;
	        }
	    }
	    return table[n][m-1];
	}
	public static long findWays2(int target,int[] coinSizes){
		
		//int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
		long[] ways = new long[target+1];
		Arrays.sort(coinSizes);
		ways[0] = 1;
		 
		for (int i = 0; i < coinSizes.length; i++) {
		    for (int j = coinSizes[i]; j <= target; j++) {
		        ways[j] += ways[j - coinSizes[i]];
		    }
		}
		return ways[target];
	}
	
	public static void main(String args[]){
		
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int len=in.nextInt();
		int[] coins =new int[len];
		for(int i=0;i<len;i++){
			coins[i]=in.nextInt();
		}
		Arrays.sort(coins);
		System.out.println(findWays2(num,coins));
		
	}

}
