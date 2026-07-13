package zoho;
import java.util.*;
public class Sum_of_Prime_numbers {
	public static void main(String[] args) {
		int ans=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    for(int i=2;i<=n;i++) {
	    	boolean prime=true;
	    	for(int j=2;j*j<=i;j++) {
	    		if(i%j==0) {
	    			prime=false;
	    			break;
	    		}
	    	}
	    	if(prime) {
	    		ans+=i;
	    	}
	    }
	    System.out.print(ans);
		

	}

}
