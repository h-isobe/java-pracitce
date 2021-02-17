//コード14-15 静的メソッドから非静的メンバを利用(エラー)
public class Hero {
  String name;      //非静的メンバ
  int hp;         
  static int money; //静的メンバ

  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
    System.out.println(this.name + "たちの所持金を初期化しました");  //エラーになる

    /*
    静的メソッドはインスタンスが生成されていなくても呼び出せるが、
    勇者インスタンスが存在しない状況でsetRandomMoney()が動いても、
    this.nameが処理できないのは明確
    */
  }
}