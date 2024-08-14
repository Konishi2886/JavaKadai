package practice;


public class Quest3_1{
	public static void main(String[] args) {
//		myCatインスタンスを作成する
		Quest3_Cat myCat = new Quest3_Cat();
		
//		Nameをたまに設定する
		myCat.Name = "たま";
//		Ageを4に設定する
		myCat.Age = 4;
//		ShowProfileメソッドを呼び出す
		myCat.ShowProfile();
//		Sleepメソッドを呼び出す
		myCat.Sleep();
	}

}
