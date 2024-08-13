package practice;

public class Quest2_1 {
	public static void main(String[]args) {
//		myDogインスタンスを作成する
		Quest2_Dog myDog = new Quest2_Dog();
		
//		Quest2_DogクラスのSetNameメソッドに引数"ポチ"を渡す
		myDog.SetName("ポチ");
//		ShowProfileメソッドを呼び出す
		myDog.ShowProfile();
	}
}
