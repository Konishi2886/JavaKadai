package practice;

public class Quest2_4 {
	public static void main(String[]args) {
//		柴犬という犬種をもつmyDogインスタンスを作成する
		Quest2_TypDog myDog = new Quest2_TypDog("柴犬");
		
//		myDogインスタンスの名前をポチに設定する
		myDog.SetName("ポチ");
//		myDogインスタンスの年齢を2に設定する
		myDog.SetAge(2);
//		myDogインスタンスのShowProfileメソッドを呼び出す
		myDog.ShowProfile();
		
//		ジャックラッセルテリアという犬種を持つmyDog1インスタンスを作成する
		Quest2_TypDog myDog1 = new Quest2_TypDog("ジャックラッセテリア");
		
//		myDog1インスタンスの名前をマックスに設定する
		myDog1.SetName("マックス");
//		myDog1インスタンスの年齢を10に設定する
		myDog1.SetAge(10);
//		myDog1インスタンスのShowProfileメソッドを呼び出す
		myDog1.ShowProfile();
	}
}
