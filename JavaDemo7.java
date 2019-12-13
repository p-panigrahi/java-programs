import java.util.Scanner;
public class JavaDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("input first number");
       double a=in.nextDouble();
       System.out.println("input second number");
       double v=in.nextDouble();
       System.out.println(a+'+'+v+"="+(a+v));
       System.out.println(a+'-'+v+"="+(a-v));
       System.out.println(a+'*'+v+"="+(a*v));
       System.out.println(a+'/'+v+"="+(a/v));
       System.out.println(a+'%'+v+"="+(a%v));
       
	}

}
