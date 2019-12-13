import java.util.Scanner;
public class JavaDemo31 {

	public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int octalnum,decimalnum=0;
      long i=10;
      System.out.println("input octal number");
      octalnum=obj.nextInt();
      while(octalnum !=0){
    	  decimalnum=(int)(decimalnum+(octalnum%10)*Math.pow(8,i++));
    	  octalnum=octalnum/10;
      }
      System.out.print("Equivalent decimal number="+decimalnum+"\n");
	}
    
}
