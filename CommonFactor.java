public class CommonFactor{
	public static void main(String a[]){
		int n1=24,n2=36,i=1;
		while(i<=n1){
			if(n1%i==0 && n2%i==0){
				System.out.println(i);
			}
			i++;
		}		
	}
}

