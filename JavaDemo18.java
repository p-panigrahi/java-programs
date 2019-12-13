import java.util.Scanner;
public class JavaDemo18{
	public static void main(String args[]){
  int choice=0,a;
       System.out.println("\n0.\n1.\n2.\n3.\n4.\n5.\n6");
       System.out.println("Enter your choice");
       Scanner obj=new Scanner(System.in);
       choice=obj.nextInt();
       System.out.println("Enter a number");
       a=obj.nextInt();       
       if(a==0){
    	   System.out.println("zero");
       }
       else if(a==1){
    	   
System.out.println("one");
	}
       else if(a==2){
    	   System.out.println("two");
    	   
       }
    

	else if(a==3){
		System.out.println("thir");
		
	}
	else if(a==4){
		System.out.println("four");
	}
       


	else if(a==5){
		System.out.println("five");
	}
	else if(choice==6){
		System.out.println("six");
	}
	}       
	
}