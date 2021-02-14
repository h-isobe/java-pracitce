//コード11-16 既存のインターフェイスを継承してインターフェイスを作成
public interface Human extends Creature {
  //抽象メソッドを追加
  void talk();
  void watch();
  void hear();
  //さらに親インターフェイスからrun()メソッドを継承する
  /*親インターフェイスからrun()を抽象メソッドとした継承しているだけのため、
    extendsを使う。継承してメソッドの中身を実装する場合はimplements(実装)になる。*/
} 