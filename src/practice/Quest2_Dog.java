package practice;

public class Quest2_Dog {
	private String Name;
	private int Age;
	
//	SetNameメソッドを作成する
	public void SetName(String nm) {
		Name = nm;
	}
//	SetAgeメソッドを作成する
	public void SetAge(int age) {
		Age = age;
	}
//	ShowProfileメソッドを作成する
	public void ShowProfile() {
		System.out.println("名前は" + Name + "、年齢は" + Age +"歳です");
	}
}
