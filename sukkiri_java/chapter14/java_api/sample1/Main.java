//コード14-2 Object型にさまざまなインスタンスを代入
public class Main {
  public static void main(String[] args) {
    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = "こんにちは";

    //全てのクラスはObjectクラスをスーパークラスとして持っている
    //「全てのクラス is-a Object」あらゆるクラスはObjectの一種
  }
}