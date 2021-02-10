//コンストラクタ
//条件=>①メソッド名がクラス名と完全に等しい ②メソッド宣言に戻り値が記述されていない(voidもダメ)
public class Hero {
  String name;
  int hp;

  public Hero(String name) {
    this.hp = 100;     //hpフィールドを100で初期化
    this.name = name;  //引数の値でnameフィールドを初期化
  }
}