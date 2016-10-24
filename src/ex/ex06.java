package ex;
import java.util.*;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class ex06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("幾位學生:");
		int n=sc.nextInt();
		int data[]=new int[n];
		System.out.println("所有學生的學號:");
		for(int i=0;i<n;i++){//學號進data
			int num=sc.nextInt();
			data[i]=num;
		}
		for(int i=0;i<n;i++){//顯示輸入學號
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.println("排序後");
		for(int x=0;x<n-1;x++){
	      	  for(int y=0;y<n-1;y++)     //兩個兩個[順序]交換  因為最後沒有數字了所以-1  -x為已排完數字
	             if( data[y] < data[y+1] ){
	      	       int tmp=data[y];          //第一次最小的在最右邊   第二次 第二小在右邊  依此類推
	      	       data[y]=data[y+1];
	      	       data[y+1]=tmp;
	      }
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
	}

}
