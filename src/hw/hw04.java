package hw;
import java.util.*;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1/(1*2)+1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
 * Date: 2016/10/24
 * Author: 105021030 �i�ʷ�
 */
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+1f/((2*i-1)*(2*i));//�p��O��ƩҥH�n�[f
		}
		System.out.print("���G"+sum);
		
		
		
	}

}
