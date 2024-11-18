import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
    public static void main(String args[]) {

    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
		sc.nextLine();
    	for(int test_case=1;test_case<=t;test_case++) {
    		int size = sc.nextInt();
    		sc.nextLine();
    		String[][] farm = new String[size][size];
    		for(int i=0;i<size;i++) {
    			String row = sc.nextLine();
    			farm[i] = row.split("");
    		}
    		int total = 0;
    		int mid = size/2;
    		int range = 0;
    		for(int row=0;row<size;row++) {
    			for(int col=mid-range; col<=mid+range;col++) {
    				total+=Integer.parseInt(farm[row][col]);
    			}
				if(row<mid) {
					range++;
				}else {range--;}
    		}
    		System.out.println("#"+test_case+" "+total);
    	}
    }
}