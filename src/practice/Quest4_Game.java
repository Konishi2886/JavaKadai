package practice;

import java.util.Scanner;

public class Quest4_Game {
//	Quest4_Gameのプライベートフィールドを作成する
	private Quest4_Player player;
	
//	Quest4_Gameのコンストラクタを作成する
	public Quest4_Game(Scanner scanner) {
//		Quest4_Gameのインスタンスを作成後、Quest4_Playerクラスのコンストラクタを呼び出し、nameという引数があなたという文字列で初期化する
		player = new Quest4_Player("あなた");
//		chooseHandメソッドを呼び出す
		player.chooseHand(scanner);
	}
//	start()メソッドを呼び出す
	public void start() {
		System.out.println("じゃんけんを開始します。");
//		決着がつくまでループする
		while(true) {
//			コンピュータの手を1に設定する
			int computerHand = 1;
//			プレイヤーの手をgetHandメソッドを呼び出して決定する
			int playerHand = player.getHand();
		
//			表示する手の配列を作成する
			String[] hands = {"グー","チョキ","パー"};
//			プレイヤーの選択した手を文字列で表示する
			System.out.println("あなた：" + hands[playerHand]);
//			コンピュータの手を文字列を表示する
			System.out.println("コンピュータ：" + hands[computerHand]);
		
//			あいこのとき
			if(playerHand == computerHand) {
				System.out.println("あいこです。もう一度！");
				
				player.chooseHand(new Scanner(System.in));
				continue;
			}
			else if((playerHand == 0 && computerHand == 1) ||
				(playerHand == 1 && computerHand == 2) ||
				(playerHand == 2 && computerHand == 0)) {
				System.out.println("あなたの勝ちです！おめでとうございます！");
				break;
			}
			else {
				System.out.println("あなたの負けです。残念！");
				break;
			}
		}
	}
}

//模範解答

//package test4;
//
//public class Program {
//	
//	private String Result;
//	public Boolean Finish;
//
//	public void Start() {
//		Finish = false;
//		System.out.println("じゃんけんを開始します。");
//		System.out.println("あなたの手を選んでください。");
//		System.out.println("0 : グー");
//		System.out.println("1 : チョキ");
//		System.out.println("2 ： パー");
//	}
//
//	public void Battle(String userHand, String comHand) {
//		
//		System.out.println("最初はグー、じゃんけん");
//
//		System.out.println("あなた：" + userHand);
//		System.out.println("コンピュータ：" + comHand);
//			
//		switch (userHand) {
//		case "グー":
//			switch (comHand) {
//			case "グー":
//				Result = "あいこ";
//				break;
//			case "チョキ":
//				Result = "勝ち";
//				break;	
//			case "パー":
//				Result = "負け";
//				break;
//			}
//			break;
//		case  "チョキ":
//			switch (comHand) {
//			case "グー":
//				Result = "負け";
//				break;
//			case "チョキ":
//				Result = "あいこ";
//				break;	
//			case "パー":
//				Result = "勝ち";
//				break;
//			}
//			break;
//		case  "パー":
//			switch (comHand) {
//			case "グー":
//				Result = "勝ち";
//				break;
//			case "チョキ":
//				Result = "負け";
//				break;	
//			case "パー":
//				Result = "あいこ";
//				break;
//			}
//			break;
//		}
//		
//		switch (Result) {
//		case "勝ち":
//		case "負け":
//			Finish = true;
//			break;	
//		case "あいこ":
//			Finish = false;
//			break;
//		}
//		
//	}
//	
//	public void end() {
//
//		if(Finish) {
//			System.out.println("あなたの" + Result + "です！");
//		}else {
//			System.out.println(Result + "です。やり直します。");
//		}
//
//	}
//	
//}