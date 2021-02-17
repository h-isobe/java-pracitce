//コード14-14 newせずとも静的メソッドは呼び出し可能
public class Main {
  public static void main(String[] args) {
    Hero.setRandomMonew();
    System.out.println(Hero.money);  //ランダムな金額を表示
    Hero h1 = new Hero();
    System.out.println(h1.money);    //同じ額を表示
  }
}