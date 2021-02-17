//コード14-12 newせずとも静的フィールドは利用可能
public class Main {
  public static void main(String[] args) {
    //1人も勇者を生み出していない状況で。。。
    Hero.money = 100;
    System.out.println(Hero.money);
  }
}