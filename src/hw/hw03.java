package hw;
import java.util.*;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class hw03 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int sum=1;
		while(sum<=10000){
			count++;
			sum=sum*n;
		}
		System.out.print("次方次數"+count);
		
		
		
	}

}
