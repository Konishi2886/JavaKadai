package practice;

public class Quest2_TypDog {
	private String Name;
	private int Age;
	private String Breed;
	
//	Quest2_TypDogのコンストラクタを作成する
	public Quest2_TypDog(String br) {
		Breed = br;
	}
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
		System.out.println(Breed + "の" + Name + "、年齢は" + Age + "歳です");
	} 
}
