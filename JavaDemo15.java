import java.util.Scanner;
public class JavaDemo15 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sal,b;
		System.out.println("input your salary");
		int salary=in.nextInt();
        if(salary>=20000){
        	b=(salary*20)/100;
        	sal=salary+b;
        }
        System.out.println("Salary is=" + salary);
	}

}
