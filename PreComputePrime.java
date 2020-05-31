//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/sum-of-primes-7/description/?layout=old
import java.util.*;
public class PreComputePrimeja{
    public static void main(String[] args){
	//range of prime number
        final int limit=1000001;
	//prime number
        long prime[]=new long[limit];
        for(int i=2;i<limit;i++){
            if (i%2!=0)
                prime[i]=i;
        }
        for(int i=2;i*i<limit;i++){
            if (prime[i]!=0){
                for (int j=i*i;j<limit;j+=i)
                    prime[j]=0;
            }
        }
        prime[2]=2;
        long sum[]=new long[(int)limit];
	//Sum of prime number upto this range
        for(int i=1;i<limit-1;i++)
        {
            sum[i]=sum[i-1]+prime[i];
        }
	Scanner sc=new Scanner(System.in);
	//Test Cases
        int t=sc.nextInt();
	//it is reduce the much time
        StringBuffer sb=new StringBuffer();
        while(t-->0){
	    //Starting range
            int l=sc.nextInt();
	    //upto this range
            int r=sc.nextInt();
            sb.append(sum[r]-sum[l-1]+"\n");
        }
	//we will print all test cases
         System.out.println(sb.toString());
    }
}
