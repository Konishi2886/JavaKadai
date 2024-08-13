package practice;

import java.util.Scanner;

public class Quest1_2 {
	public static void main(String[]args) {
//		scannerインスタンスを作成し、入力を受け付ける
		Scanner scanner = new Scanner(System.in);
		
//		10この整数を格納する配列を作成する
		int values[] = new int[10];
		System.out.println("数字を5個入力してください");
//		ループして整数を配列に格納する
		for(int i = 0 ; i < 5; i++) {
			values[i] = scanner.nextInt();
		}
//		scannerを閉じる
		scanner.close();
		
//		ループしながら配列を比較して順番を入れ替える
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i + 1 ; j < 5 ; j++) {
				if(values[i] > values[j]) {
//					変数tにvalue[i]を入れる
					int t = values[i];
//					value[i]にvalue[j]の値を上書きする
					values[i] = values[j];
//					value[j]に逃がしておいたvalue[i]の値が入った変数tを入れる
					values[j] = t;
				}
			}
		}
//		ループしながら配列を出力する
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(values[i] + " ");
		}
	}
}
