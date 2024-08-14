package practice;

public class Quest3_3 {
	public static void main(String[]args) {
//		myCatインスタンスを作成する
		Quest3_Cat myCat = new Quest3_Cat();
//		myDogインスタンスを作成する
		Quest3_Dog myDog = new Quest3_Dog();
		
//		myCatインスタンスの名前をたまに設定する
		myCat.Name = "たま";
//		myCatインスタンスの年齢を4に設定する
		myCat.Age = 4;
//		myCatインスタンスのShowProfileメソッドを呼び出す
		myCat.ShowProfile();
		
//		myDogインスタンスの名前をマックスに設定する
		myDog.Name = "マックス";
//		myDogインスタンスの年齢を12に設定する
		myDog.Age = 12;
//		myDogインスタンスのShowProfileメソッドを呼び出す
		myDog.ShowProfile();
		
//		myCatインスタンスのSpeakメソッドを呼び出す
		myCat.Speak();
//		myDogインスタンスのSpeakメソッドを呼び出す
		myDog.Speak();
	}
}
