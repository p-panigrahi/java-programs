import java.util.Scanner;
public class JavaDemo26 {

	public static void main(String[] args) {
       int decnum,rem;
       String hexdecnum="";
       char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','f'};
       Scanner obj=new Scanner(System.in);
       System.out.println("input s decimal number");
       decnum=obj.nextInt();
       while(decnum>0){
    	   rem=decnum%16;
    	   hexdecnum=hex[rem]+hexdecnum;
    	   decnum=decnum/16;
       }
       System.out.println("Hexdecimalnumber is="+hexdecnum);
	}

}
