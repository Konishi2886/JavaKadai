package practice;

public class Quest2_2 {

	public static void main(String[] args) {
		Quest2_Dog myDog = new Quest2_Dog();
		
//		Quest2_DogクラスのSetNameメソッドに引数"ポチ"を渡す
		myDog.SetName("ポチ");
//		Quest2_DogクラスのSetAgeメソッドに引数"5"を渡す
		myDog.SetAge(5);
//		ShowProfileメソッドを呼び出す
		myDog.ShowProfile();
	}

}
