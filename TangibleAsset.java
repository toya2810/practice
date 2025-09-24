package ex_11_1;

public abstract class TangibleAsset { //クラス宣言
	//フィールド
	String name;
	int price;
	String color;
	//コンストラクタ
	public TangibleAsset(String name,int price,String color) {//フィールドの数ぶんだけ引数
		this.name = name;
		this.price = price;
		this.color =color;
	}
	//メソッド
	public String getName() {return this.name;} //()忘れないようにする
	public int getPrice() {return this.price;}	//()忘れないようにする
	public String color() {return this.color;}	//()忘れないようにする

}
