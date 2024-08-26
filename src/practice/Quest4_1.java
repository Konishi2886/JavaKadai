package practice;

import java.util.Scanner;

public class Quest4_1 {
	public static void main(String[]args) {
//		標準入力を読み取るためのオブジェクトscannerを作成する
		Scanner scanner = new Scanner(System.in);
//		gameインスタンスを作成する。また、Quest4_Gameのコンストラクタを呼び出す
		Quest4_Game game = new Quest4_Game(scanner);
//		start()メソッドを呼び出す
		game.start();
	}
}
