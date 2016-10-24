package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=2;
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+m*i;
		}
		System.out.print(sum);
	}

}
