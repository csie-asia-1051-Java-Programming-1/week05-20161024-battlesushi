package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
			sum=sum*i;
		}
		System.out.print(sum);
		
	}

}
