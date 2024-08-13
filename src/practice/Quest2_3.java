package practice;

public class Quest2_3 {
	public static void main(String[]args) {
		Quest2_Dog myDog1 = new Quest2_Dog();
		Quest2_Dog myDog2 = new Quest2_Dog();
		
//		Quest2_DogクラスのSetNameメソッドに引数"ポチ"を渡す
		myDog1.SetName("ポチ");
//		Quest2_DogクラスのSetAgeメソッドに引数"4"を渡す
		myDog1.SetAge(4);
//		ShowProfileメソッドを呼び出す
		myDog1.ShowProfile();
		
//		Quest2_DogクラスのSetNameメソッドに引数"マックス"を渡す
		myDog2.SetName("マックス");
//		Quest2_DogクラスのSetAgeメソッドに引数"9"を渡す
		myDog2.SetAge(9);
//		ShowProfileメソッドを呼び出す
		myDog2.ShowProfile();
	}
}
