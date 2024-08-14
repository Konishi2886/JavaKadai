package practice;

import java.util.Scanner;

public class Quest2_5 {
	public static void main(String[]args) {
//		scannerのインスタンスを作成する
		Scanner scanner = new Scanner(System.in);
//		myCaseインスタンスを作成する
		Quest2_CoinCase  myCase = new Quest2_CoinCase();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("硬貨の種類は？");
//			入力値をkindに格納する
			int kind = scanner.nextInt();
			System.out.println("硬貨の枚数は");
//			入力値をcountに格納する
			int count = scanner.nextInt();
			
//			格納した整数をAddCoinに渡す
			myCase.AddCoin(kind, count);
		}
//		scannerを閉じる
		scanner.close();
		
//		硬貨の種類ごとに枚数を表示する
		System.out.println("500円は" + myCase.GetCount(500) + "枚");
		System.out.println("100円は" + myCase.GetCount(100) + "枚");
		System.out.println("50円は" + myCase.GetCount(50) + "枚");
		System.out.println("10円は" + myCase.GetCount(10) + "枚");
		System.out.println("5円は" + myCase.GetCount(5) + "枚");
		System.out.println("1円は" + myCase.GetCount(1) + "枚");
//		総額を表示する
		System.out.println("総額は" + myCase.GetAmount() + "円");
	}
}
