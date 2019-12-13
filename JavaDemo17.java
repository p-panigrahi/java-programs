import java.util.Scanner;
public class JavaDemo17 {

	public static void main(String[] args) {
       int choice=0,a,b;
       System.out.println("\n1.add\n2.sub\n3.mul\n4.div\n5.exit");
       System.out.println("Enter your choice");
       Scanner obj=new Scanner(System.in);
       choice=obj.nextInt();
       if(choice==1){
    	   System.out.println("Enter two number");
    	   a=obj.nextInt();
    	   b=obj.nextInt();
    	   System.out.println("Addition result="+(a+b));
       }
       else if(choice==2){
    	   System.out.println("Enter two number");
    	   a=obj.nextInt();
    	   b=obj.nextInt();
    	   System.out.println("Sub result="+(a-b));
       }
       else if(choice==3){
       System.out.println("Enter two number");
       a=obj.nextInt();
       b=obj.nextInt();
       System.out.println("mul result ="+(a*b));
	}
	else if(choice==4){
		System.out.println("Enter two number");
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("Div result="+(a/b));
	}
	else if(choice==5);
       System.exit(0);
	
	}
}
