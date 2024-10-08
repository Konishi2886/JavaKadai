package practice;

public class Quest2_CoinCase {
	private int Yen500 = 0;
	private int Yen100 = 0;
	private int Yen50 = 0;
	private int Yen10 = 0;
	private int Yen5 = 0;
	private int Yen1 = 0;
	
	public void AddCoin(int kind,int count) {
//		硬貨の種類ごとにカウントを増やす
		switch(kind) {
		case 500:
			Yen500 += count;
			break;
		case 100:
			Yen100 += count;
			break;
		case 50:
			Yen50 += count;
			break;
		case 10:
			Yen10 += count;
			break;
		case 5:
			Yen5 += count;
			break;
		case 1:
			Yen1 += count;
			break;
		default:
			System.out.println("無効な種類の硬貨です");
			break;
		}
	}
	
	public int GetCount(int kind) {
		int resultCount = 0;
		
//		各硬貨ごとの枚数を格納し、戻り値として返す
		switch(kind) {
		case 500:
			resultCount = Yen500;
			break;
		case 100:
			resultCount = Yen100;
			break;
		case 50:
			resultCount = Yen50;
			break;
		case 10:
			resultCount = Yen10;
			break;
		case 5:
			resultCount = Yen5;
			break;
		case 1:
			resultCount = Yen1;
			break;
		}
		return resultCount;
	}
//	硬貨の総数を戻り値として返す
	public int GetCount() {
		return Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
	}
//	総額を戻り値として返す
	public int GetAmount() {
		return (Yen500 * 500) + (Yen100 * 100) + (Yen50 * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1;	
	}
			
}
