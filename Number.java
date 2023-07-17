package Num_onebit;
import java.util.*;
public class Number {
		    public static int binary(int num){
		                String x = Integer.toBinaryString(num);
		                int c=0;
		                for(int i=0;i<x.length();i++){
		                    if (x.charAt(i)=='1'){
		                        c++;
		                    }
		                }
		                System.out.println(c);
		                return c;
		            }
			public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        int num = 6;
			        binary(num);

	}

}
