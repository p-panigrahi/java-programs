import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
                Scanner obj = new Scanner(System.in);
                int i=1;
                int num=90;
                System.out.println("Enter a positive int");
                num=obj.nextInt();
                System.out.println("multiplication="+num);       
                while(i<=10){
                       System.out.println(num+"*"+i+"="+(num*i));
                       i++;
               }
       }
}