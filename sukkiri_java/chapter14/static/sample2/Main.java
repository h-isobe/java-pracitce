//コード14-11 各インスタンスから静的フィールドを利用可能
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Hero.money = 100;
    System.out.println(Hero.money)  //100と表示
    System.out.println(h1.money)    //100と表示
    h1.money = 300;                 //h1.moneyに300を代入
    System.out.println(h2.money)    //h2.moneyでも300と表示
  }
}