package practice;

import java.util.Scanner;

public class Quest2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quest2_CoinCase myCase = new Quest2_CoinCase();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("硬貨の種類は？");
			int kind = scanner.nextInt();
			System.out.println("硬貨の枚数は？");
			int count = scanner.nextInt();
			
			myCase.AddCoin(kind, count);
		}
		scanner.close();
		
		System.out.println("500円は" + myCase.GetCount(500) + "枚");
		System.out.println("100円は" + myCase.GetCount(100) + "枚");
		System.out.println("50円は" + myCase.GetCount(50) + "枚");
		System.out.println("10円は" + myCase.GetCount(10) + "枚");
		System.out.println("5円は" + myCase.GetCount(5) + "枚");
		System.out.println("1円は" + myCase.GetCount(1) + "枚");
		System.out.println("硬貨の総数は" + myCase.GetCount() + "枚");
		System.out.println("総額は" + myCase.GetAmount() + "円");
	}
}
