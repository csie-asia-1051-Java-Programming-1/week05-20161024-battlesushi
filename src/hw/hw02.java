package hw;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0,sum=0;
		while(m<n){
			sum++;
			m=m+sum;
			if(m>n){
				sum--;
				System.out.print("最大整數m="+sum);
			}
			else if(m==n)
				System.out.print("最大整數m="+sum);
		}
		
		
		
		
	}

}
