import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
    		Scanner sc = new Scanner(System.in);
    		int [][] table = new int[100][100];
    		for(int tc =1; tc<=10; tc++) {
        		int t = sc.nextInt();
        		sc.nextLine();
        		int rowt[] = new int [100];
        		int colt[] = new int [100];
        		int big[] = new int[4];
        		int p = 100;
    			for(int row=0; row<100;row++) {
    				for(int col=0;col<100;col++) {
    					table[row][col]=sc.nextInt();
    					rowt[row] += table[row][col];
    					colt[col] += table[row][col];
    				}
    			}
    			for(int n=0; n<100; n++) {
    				if(rowt[n]>big[0]) {
    					big[0] = rowt[n];
    				}
    				if(colt[n]>big[1]) {
    					big[1] = colt[n];
    				} 
    				p--;
    				big[2] += table[n][n];
    				big[3] += table[n][p];
    			}

    			Arrays.sort(big);
    			System.out.println("#"+tc+" "+big[3]);
    			
    		}
    		sc.close();
    }
}