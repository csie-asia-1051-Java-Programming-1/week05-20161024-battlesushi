package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021030 張廷毓
 */
public class ex05 {
	public static void main(String[] args) {
		
		double data[][]=new double[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				data[i][j]=Math.random()*10;
				System.out.print((int)Math.floor(data[i][j])+" ");		
			}
				System.out.println();
		}
		System.out.println("原本陣列");
		System.out.println("轉置後");
		int data2[][]=new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				data2[i][j]=(int)data[j][i];
				System.out.print(data2[i][j]+" ");		
			}
				System.out.println();
		}
		
		
	}
}
