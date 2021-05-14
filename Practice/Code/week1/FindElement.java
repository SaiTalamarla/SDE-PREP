package criodo.programming.psds.week1;

import java.util.*;

class FindElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int result = findElement(n, arr, x);

        System.out.println(result);
        
        sc.close();
    }

    // TODO: Implement this method
    static int findElement(int n, int[] arr, int x) {
    	for(int i=0;i<n;i++) {
    		if(x==arr[i]) {
    			return x;
    		}
    	}
    	return -1;
    }
}

