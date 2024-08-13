package practice;

import java.util.Scanner;

public class Quest1_1 {
	public static void main(String[]args) {
//		scannerインスタンスを作成し、入力を受け付ける
		Scanner scanner = new Scanner(System.in);
		System.out.println("何月ですか？");
//		入力された月の数字をmonthに格納する
		int month = scanner.nextInt();
//		scannerを閉じる
		scanner.close();
		
		switch(month) {
//		2月の時
		case 2:
			System.out.println("28日です");
			break;
//		4,6,9,11月の時
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日です");
			break;
//		1,3,5,7,8,10,12月の時
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31日です");
			break;
//		それ以外の時
		default:
			System.out.println("入力が間違っています");
			break;
		}
	}
}