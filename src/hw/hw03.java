package hw;
import java.util.*;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 105021030 �i�ʷ�
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
		System.out.print("���覸��"+count);
		
		
		
	}

}
