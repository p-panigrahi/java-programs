import java.util.Scanner;
public class JavaDemo29 {

	public static void main(String[] args) {
       int[]hex=new int[1000];
       int i= 1,j=0,rem,dec=0,bin;
       Scanner obj=new Scanner(System.in);
       System.out.println("input a binary number=");
       bin=obj.nextInt();
       while(bin>0){
    	   rem=bin%2;
    	   dec=dec+rem*1;
    	   i=i*2;
    	   bin=bin/10;
       }
       i=0;
       while(dec !=0){
    	   hex[i]=dec%16;
    	   dec=dec/16;
    	   i++;
       }
       System.out.println((char)(hex[j]=55)+"\n");
	}

}


