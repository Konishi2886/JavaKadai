package practice;

public class Quest2_4 {
	public static void main(String[]args) {
		Quest2_TypDog myDog = new Quest2_TypDog("柴犬");
		
		myDog.SetName("ポチ");
		myDog.SetAge(2);
		myDog.ShowProfile();
		
		Quest2_TypDog myDog1 = new Quest2_TypDog("ジャックラッセテリア");
		
		myDog1.SetName("マックス");
		myDog1.SetAge(10);
		myDog1.ShowProfile();
	}
}
