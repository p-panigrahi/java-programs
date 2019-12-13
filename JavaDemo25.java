import java.util.Scanner;
public class JavaDemo25 {

	public static void main(String[] args) {
      int decnumber,quot,i=1,j;
      int binarynumber[]=new int[100];
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter first decnumber");
      decnumber=obj.nextInt();
      quot=decnumber;
      while(quot !=0){
    	  binarynumber[i++]=quot%2;
    	  quot=quot/2;
      }
      System.out.println("binary nimber is=");
      for(j=i-1;j>0;j--){
    	  System.out.println(binarynumber[j]);
      }
      System.out.println("\n");
	}

}
