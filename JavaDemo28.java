import java.util.Scanner;
public class JavaDemo28 {

	public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
         long binarynumber,decimalnumber=0,j=1,remainder;
         System.out.println("input a binary number");
         binarynumber=obj.nextInt();
         while(binarynumber !=0){
        	 remainder=binarynumber%10;
        	 decimalnumber=decimalnumber+remainder*j;
        	 j=j*2;
        	 binarynumber=binarynumber/10;
         }
         System.out.println("decimalnumber="+decimalnumber);
	}

}
