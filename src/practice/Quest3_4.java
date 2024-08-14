package practice;

public class Quest3_4 {
	public static void main(String[]args) {
//		要素数4の未定義の配列を作成する
		Quest3_Animal[] myPets = new Quest3_Animal[4];
		
//		配列にそれぞれインスタンスを格納する
		myPets[0] = new Quest3_Cat();
		myPets[1] = new Quest3_Dog();
		myPets[2] = new Quest3_Cat();
		myPets[3] = new Quest3_Dog();
		
//		ループしながら各インスタンスのSpeakメソッドを呼び出す
		for(Quest3_Animal Pet : myPets) {
			Pet.Speak();
		}
	}
}
