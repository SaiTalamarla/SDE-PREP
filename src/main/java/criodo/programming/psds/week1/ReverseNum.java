package criodo.programming.psds.week1;

import java.util.*;

class ReverseNum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);
        
        sc.close();
    }

    // TODO: Implement this method
    static int reverseNum(int num) {
    	
    	long revNum=0;
    	int remainder =0;
    		while(num>0) {
    			remainder = num%10;
    			revNum = (revNum*10)+ remainder;
    			num/=10;
    		}
		return (int)revNum;
    }
}