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