package hw;
import java.util.*;
/*
 * Topic: ���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG
 * Date: 2016/10/24
 * Author: 105021030 �i�ʷ�
 */
public class hw05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�Jn(1��n��21):");
		int n=sc.nextInt();
		int data[][]=new int[n][n];
		int run=1,a=0,b=0;
		for(int i=0;i<n;i++){//�ƶ���
			a=i; b=0; //[a][b]   a��ۦC���ܤ�   b�q�s�}�l
			for(int j=0;j<i+1;j++){//���W�T��[�]���C��i=0�ҥH�C�Ci+1��]
				data[a][b]=run;
				a--;
				b++;
				run++;
			}
			if(i==n-1){//�k�U�T��
			for(int x=0;x<n-1;x++){
				a=i;b=x+1;   //[a][b]    a�C�Ƥ@���q�̩��}�l  b�h�]���q�k�U�T���}�l�ҥH+1
				for(int y=x;y<i;y++){
				data[a][b]=run;
				a--;
				b++;
				run++;
				}
			}
			}
		}
		for(int i=0;i<n;i++){//���
			for(int j=0;j<n;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
