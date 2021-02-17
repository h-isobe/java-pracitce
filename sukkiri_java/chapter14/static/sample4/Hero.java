//コード14-13 所持金をランダムに設定する
public class Hero {
  String name;
  int hp;
  static int money;

  public static void setRandomMoney() {  //staticキーワードのメソッドは静的メソッド(クラスメソッド)と言われる
    Hero.money = (int)(Math.random() * 1000);
  }

  //①メソッド自体がクラスに所属するようになる(クラスを使って呼び出せる)
  //②インスタンスにメソッドの分身が準備される(インスタンス変数からも呼び出せる)
}