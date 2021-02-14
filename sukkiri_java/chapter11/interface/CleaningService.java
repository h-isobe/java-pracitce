//コード11-14 CleaningServise インターフェイス
public interface CleaningServise {
  //下記は全て抽象メソッド
  Shirt washShirt(Shirt s);
  Towl washTowl(Towl t);
  Coat washCoat(Coat c);
}