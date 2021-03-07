//リスト4-8 clone()による複製をサポートしたHeroクラス
public class Hero implements Cloneable {  //①Cloneインターフェイスを実装
  String name;
  int hp;
  Sword sword;

  public Hero clone() {  //②clone()メソッドをpublicでオーバーライド
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword;
    return result;      //自身の全フィールドをコピーしてrerutnで返す
  }
}

//Objectクラスのclone()メソッドはprotectedで宣言されているため、オーバーライドの際はpublicで宣言する
