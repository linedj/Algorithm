import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	for (int tc=1;tc<=10;tc++) {
    		int bnum = sc.nextInt();
    		sc.nextLine();
    		boolean [][] build = new boolean[bnum][255];
    		for(int i=0; i<bnum;i++) {
	    		int bhight = sc.nextInt();
    			for(int h=0; h<bhight;h++) {
    				build[i][h] = true;
    			}
    		}
    		int cnt = 0;
    		int total = 0;
    		for(int l=0; l<255;l++) {
    			for(int k=0; k<bnum-2;k++) {
    				if(!build[k][l]) {
    					cnt++;
    					if(cnt>1&&build[k+1][l]==true) {
    						cnt=0;
    						if(!(build[k+2][l]||build[k+3][l])) {
    							total++;
    						} 						
    					}
    				}else cnt=0;

    			}
    		}
    		System.out.println("#"+tc+" "+total);
    	}
    	sc.close();
    }
}