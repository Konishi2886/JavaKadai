package practice;

import java.util.Scanner;

public class Quest4_2 {
	public static void main(String[]args) {
//		標準入力を読み取るためのオブジェクトscannerを作成する
		Scanner scanner = new Scanner(System.in);
		Quest4_Game1 game = new Quest4_Game1(scanner);
		game.start();
		scanner.close();
	}
}
