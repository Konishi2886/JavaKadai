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

//模範解答

//package test4;
//
//import java.util.Scanner;
//
//public class Quest1 {
//
//	public static void main(String[] args) {
//
//		User com = new User("Com");
//		User person = new User("person");
//		Program program = new Program();
//		
//		Scanner input = new Scanner(System.in);
//
//		do {
//
//			program.Start();
//			String personHand = input.next();
//
//			person.SetHand(personHand);
//			com.SetHand("1");
//
//			program.Battle(person.Hand, com.Hand);
//			program.end();
//
//		} while (!program.Finish);
//
//	}
//
//}