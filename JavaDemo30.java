import java.util.Scanner;
public class JavaDemo30 {

	public static void main(String[] args) {
       int binnum,binnum1,rem,decnum=0,quot,i=1,j;
       int octnum[]=new int[1000];
       Scanner obj = new Scanner(System.in);
       System.out.println("input a binarynumber");
       binnum=obj.nextInt();
       binnum1=binnum;
       while(binnum !=0){
    	   rem=binnum%10;
    	   decnum=decnum+rem*1;
    	   i=i*2;
    	   binnum=binnum/10;
       }
       i=1;
       quot=decnum;
       while(quot>0){
    	   octnum[i++]=quot%8;
    	   quot=quot/8;
    	   
       }
       System.out.println("Equivalent octal value of="+binnum1+"is=");
       for(j=i-1;j>0;j--){
    	   System.out.println(octnum[j]);
       }
       System.out.print("\n");
	}

}
