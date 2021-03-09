//リスト6-3 関数格納用のインターフェースを宣言して利用する
public class Main {
  public static int sub(int a, int b) {
    return a - b;
  }

  public static void main(String[] args) {
    MyFunction func = Main::sub;    //宣言したインターフェースの型に代入
    int a = func.call(5, 3);        //インターフェースのメソッドで呼び出し
    System.out.println("5-3=" + a);
  }
}