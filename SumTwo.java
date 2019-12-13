public class SumTwo{
	public static void main(String a []){
		int i=19872;
		 int sum=0;
		 int rem=0;
while(i>0){
     rem=i%10;
     sum=sum+rem;
     i = i/10;
}
System.out.println(sum);
	}
}