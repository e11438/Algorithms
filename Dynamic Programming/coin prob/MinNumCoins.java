
public class MinNumCoins {
	
	public static void main(String args[]){
		int[] d={50,25,10,1};
		
		int[] res =countChange(63,d);
		
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+ " ");
		}
		System.out.println();
		System.out.println(res[res.length-1]);
		
	}
	
	public static int[] countChange(int num,int[] coinList){
		int[] c = new int[num+1];
		c[0]=0;
		for(int j=1;j<c.length;j++){
			c[j]=Integer.MAX_VALUE;
			for(int i=0;i<coinList.length;i++){
				if(j>=coinList[i]&&c[j]>1+c[j-coinList[i]]){
					c[j]=1+c[j-coinList[i]];
				}
			}
			
		}		
		return c;
	}

}
