import java.util.*;

class MaxSubSum {
	public static void main(String[] args) {
		int[] arr = {4,1,1,1,2,3,5};
		int i=0,j=0;
		int k=5;
		int sum=0;
		int mx=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			if(sum < k) {
				j++;
			}
			if(sum==k) {
				if((j-i+1) > mx) {
					mx=j-i+1;
				}
				mx = Math.max(mx,(j-i+1));
				j++;
			}
			
			if(sum > k) {
				while(sum > k) {
					sum=sum-arr[i];
					i++;
				}
				j++;
			}
		}
		System.out.println(mx);		
	}
}
