public class Factor{
	public static void main(String a[]){
		int n=24;
		int i=1;
		int rem=0;
		while(i<=24){
			rem=n%i;
			if(rem==0){
				System.out.println(i);
			}
			
			i++;
		}
        
	}
}