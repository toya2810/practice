package ex_11_1;

public class Book extends TangibleAsset { 
	//差分をかく
	String isbn;
	//コンストラクタ　継承なので()内にも親で引き継ぎたい部分＋差分
	public Book(String name,int price,String color,String isbn) { 
		super (name,price,color);//継承なのでsuper(親で呼び出したい部分)の形で記載(10章参照
		this.isbn = isbn;		//差分の記載
	}
	//メソッド
	public String getIsbn() { return this.isbn;}
}
