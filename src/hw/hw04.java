package hw;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+1f/((2*i-1)*(2*i));//計算是整數所以要加f
		}
		System.out.print("結果"+sum);
		
		
		
	}

}
