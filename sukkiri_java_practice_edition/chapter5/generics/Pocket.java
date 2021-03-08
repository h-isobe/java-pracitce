//リスト5-4 ジェネリクスを使ったPocketクラス
public class Pocket<E> {  //仮型引数を伴うクラス宣言
  private E data;         //以下は仮型引数Eを利用したメンバ宣言
  public void put(E d) {
    this.data = d;
  }
  public get() {
    return this.data;
  }
}