import java.util.Scanner;
public class JavaDemo16 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s,b;
		System.out.println("Input your sal");
		int sal=in.nextInt();
		if(sal<=30000){
			 b=(sal*20)/100;
			 sal=sal+b;
		}
		else{
			b=(sal%10)/100;
			sal=sal+b;
		}
		System.out.println("Total salar="+sal);

	}

}
