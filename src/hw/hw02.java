package hw;
import java.util.*;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021030 �i�ʷ�
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
				System.out.print("�̤j���m="+sum);
			}
			else if(m==n)
				System.out.print("�̤j���m="+sum);
		}
		
		
		
		
	}

}
