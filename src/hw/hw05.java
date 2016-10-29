package hw;
import java.util.*;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class hw05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入n(1＜n＜21):");
		int n=sc.nextInt();
		int data[][]=new int[n][n];
		int run=1,a=0,b=0;
		for(int i=0;i<n;i++){//排順序
			a=i; b=0; //[a][b]   a跟著列數變化   b從零開始
			for(int j=0;j<i+1;j++){//左上三角[因為列數i=0所以每列i+1個]
				data[a][b]=run;
				a--;
				b++;
				run++;
			}
			if(i==n-1){//右下三角
			for(int x=0;x<n-1;x++){
				a=i;b=x+1;   //[a][b]    a列數一直從最底開始  b則因為從右下三角開始所以+1
				for(int y=x;y<i;y++){
				data[a][b]=run;
				a--;
				b++;
				run++;
				}
			}
			}
		}
		for(int i=0;i<n;i++){//顯示
			for(int j=0;j<n;j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
