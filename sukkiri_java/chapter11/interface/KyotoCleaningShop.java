//インターフェイスを継承したクラスの定義
//インターフェイスを継承してクラスを宣言する場合はimplements(実装)
public class KyotoCleaningShop implements CleaningServise {
  String ownerName;
  String address;
  String phone;

  //抽象メソッドを継承しているためメソッドのオーバーライドが必要
  //シャツを洗う
  public Shirt washShirt(Shirt s) {
    //大型洗濯機15分
    return s;
  }
  //タオルを洗う
  public Towl washTowl(Towl t) {
    //大型洗濯機10分
    return t;
  }
  //コートを洗う
  public Coat washCoat(Coat c) {
    //ドライ20分
    return c;
  }
}