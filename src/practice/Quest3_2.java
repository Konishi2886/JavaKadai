package practice;

public class Quest3_2{
	public static void main(String[]args) {
//		myCatインスタンスを作成する
		Quest3_Cat myCat = new Quest3_Cat();
//		myDogインスタンスを作成する
		Quest3_Dog myDog = new Quest3_Dog();
		
//		myCatインスタンスのNameフィールドをたまに設定する
		myCat.Name = "たま";
//		myCatインスタンスのAgeフィールドを4に設定する
		myCat.Age = 4;
//		ShowProfileメソッドを呼び出す
		myCat.ShowProfile();
		
//		myDogインスタンスのNameフィールドをマックスに設定する
		myDog.Name = "マックス";
//		myDogインスタンスのAgeフィールドを10に設定する
		myDog.Age = 10;
//		ShowProfileメソッドを呼び出す
		myDog.ShowProfile();
		
//		myCatインスタンスのSleepメソッドを呼び出す
		myCat.Sleep();
//		myDogインスタンスのRunメソッドを呼び出す
		myDog.Run();
	}
}
