public class HCF{
	public static void main(String a[]){
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int i=1,hcf=1;
		while(i<=n1){
			if(n1%i==0 && n2%i==0){
				hcf=i;
				
			}
			i++;
		}		
		System.out.println(hcf);
	}
}

