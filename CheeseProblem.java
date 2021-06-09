package corejava;

import java.util.Scanner;

public class CheeseProblem {

	static int FindMaxSum(int arr[], int n)
    {
		int sum[] = new int[n+1];
		sum[0]=0;
		sum[1]=arr[0];
		
		for(int i=1 ; i<n ; ++i) {
			
			sum[i+1] = Math.max(sum[i], sum[i-1]+arr[i]);
		}
		
		return sum[n];
        
    }
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i=0;
		while(i<t) {
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;++j) {
				arr[j] = sc.nextInt();
			}
			
			System.out.println(FindMaxSum(arr, arr.length));
			i++;
		}

	}

}
