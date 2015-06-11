#include<stdio.h>



int main(){
	
	int n=399;
	int y=0xABCDEF;
	int z=012323;
	
	
	
	//upper case and lower case
	printf("%X-Upper case\n",n);
	printf("%x-Lower case\n",n);
	
	// diff kinds of padding
	puts("");
	printf("<%8x>-padded with blank till 8\n",n);
	printf("%04x-padded with zeros\n",n);
	printf("%08x-padded with 8 zeros\n",n);
	puts("");
	
	//hash mark,#,adds 0x to number
	printf("%#x-Automatically add 0x\n",y);
	printf("%#X-capital X,Automatically add 0X\n",y);	
	printf("%#X-but dont add 0X if zero\n",0);
	
	puts("");
	//hash mark plus padding
	printf("%#8x-no padding is added with #.\n",y);
	printf("%#8X-no padding is added with #.\n",y);
	printf("%#08X-padding is added with 0,but dont add 0X.\n",0);
	
	printf("%d-hex as decimal\n",y);
	printf("%d-octal as decimal\n",z);
	
	int z1=z;
	printf("%X-octal as hex",z1);
	
	return 0;
}
