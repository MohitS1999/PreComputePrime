import java.util.*;
public class PreComputePrime{
	public static void main(String[] ars){
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10001];
		Arrays.fill(a,0);
		// for (int j=0;j<1000000;j++){
			// System.out.println(a[j]);
		// }
		primeSteive(a);
		int n=sc.nextInt();
		for (int i=3;i<=n;i+=2){
			System.out.println(i);
		}
		int csum[]=new int [10001];
		Arrays.fill(csum,0);
		for(int i=1;i<=10000;i++){
			csum[i]=csum[i-1]+a[i];
		}
		System.out.println("Enter the test cases");
		int t=sc.nextInt();
		while(t-->0){
			System.out.println("Enter the x and y from between you find prime number");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(csum[y]-csum[x-1]);
		}
	}
	public static void primeSteive(int a[]){
		for (int i=3;i<=10000;i+=2){
			a[i]=1;
		}
		for (int i=3;i<=10000;i+=2){
			if (a[i]==1){
				for(int j=i*i;j<=10000;j=i+j){
					a[j]=0;
				}
			}
		}
		a[2]=1;
	}
}