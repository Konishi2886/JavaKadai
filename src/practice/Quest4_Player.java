package practice;

import java.util.Scanner;

public class Quest4_Player {
//	クラス内でプライベートフィールドを宣言する
	private String name;
	private int hand;
	
	
	//Quest4_Playerのコンストラクタを作成する	
	public Quest4_Player(String name) {
		this.name = name;
	}

//	chooseHandメソッドを作成する
	public void chooseHand(Scanner scanner) {
		System.out.println(name + "の手を選んでください");
		System.out.println("0:グー");
		System.out.println("1:チョキ");
		System.out.println("2:パー");
		System.out.println("→");
		
//		正しい値が入力されるまでループする
		while(true) {
//			入力値が整数でないときの処理
			if(!scanner.hasNextInt()) {
				System.out.println("正しい値が入力されませんでした");
				System.out.println(name + "の手を選んでください");
//				トークンを消費して次の入力を受け付ける
				scanner.next();
//				ループの現在の反復をスキップして次の反復に進む
				continue;
			}
//		整数値をchoiseに格納する
		int choise = scanner.nextInt();
		
//		整数値が0～2の間にあるか確認する
		if(choise < 0 || 2< choise) {
			System.out.println("正しい値が入力されませんでした");
			System.out.println(name + "の手を選んでください");
			System.out.println("→");
			scanner.next();
			continue;
		}
		
//		整数値をhandに格納する
		hand = choise;
//		ループを抜ける
		break;
		}
	}
	
//	getHandメソッドを作成する
	public int getHand() {
//		整数値handを返す
		return hand;
	}
}
