package practice;

import java.util.Random;
import java.util.Scanner;

public class Quest4_Game1 {
	private Quest4_Player player;
	private Random random;
	private Scanner scanner;
	
	public Quest4_Game1(Scanner scanner) {
		player = new Quest4_Player("あなた");
		random = new Random();
		this.scanner = scanner;
	}
	
	public void start() {
		System.out.println("じゃんけんを開始します");
		
		while(true) {
			int computerHand = random.nextInt(3);
			player.chooseHand(scanner);
			int playerHand = player.getHand();
			
			String [] hands = {"グー","チョキ","パー"};
			System.out.println("あなた：" + hands[playerHand]);
			System.out.println("コンピュータ：" + hands[computerHand]);
			
			if(playerHand == computerHand) {
				System.out.println("あいこです！もう一度！");
				continue;
			}
			else if((playerHand == 0 && computerHand == 1) ||
					(playerHand == 1 && computerHand == 2) ||
					(playerHand == 2 && computerHand == 0)){
				System.out.println("あなたの勝ちです！");
				break;
			}
			else {
				System.out.println("あなたの負けです！");
				break;
			}	
		}
	}
}
