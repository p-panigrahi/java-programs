import java.util.Scanner;


public class JavaDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("input first number");
        int num1=in.nextInt();
        System.out.println("input second number");
        int num2=in.nextInt();
        System.out.println("input thired number");
        int num3=in.nextInt();
        System.out.println("input fourth number");
        int num4=in.nextInt();
        System.out.println("Multipilaction of four number="+(num1%num2%num3%num4));
	}

}
