import  java.util.Scanner;
public class JavaDemo24 {

	public static void main(String[] args) {
       long binary1,binary2,multiply=0;
       int digit,factor=1;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter first binary number");
       binary1=obj.nextLong();
       System.out.println("Enter second binary number");
       binary2=obj.nextLong();
       while(binary2 !=0){
    	   digit=(int)(binary2%10);
    	   if(digit==1){
    		   binary1=binary1*factor;
    		   multiply =binaryproduct ((int)binary1, (int)multiply);
    		   
    	   }
    	   else{
    		   binary1=binary1*factor;
    		   
    	   }
    	   binary2=binary2/10;
    	   factor=10;
       }
       System.out.println("product of two binary numbers="+multiply+"\n");
	} 
	static int binaryproduct(int binary1,int binary2){
		int i=0,remainder=0;
		int[]sum=new int[20];
		int binaryprodresult=0;
		while(binary1 !=0||binary2 !=0);{
			sum[i++]=(binary1%10+binary2%10+remainder)%2;
			remainder=(binary1%10+binary2%10+remainder)/2;
			binary2=binary2/10;
		}
		if(remainder !=0){
			
		}
		sum[i++]=remainder;
	}
	--i;
	while(i>=0){
		
	}
	binarypordresult=binaryprodresult*10+sum[i--];
}
return binaryprodresult;
}
}

