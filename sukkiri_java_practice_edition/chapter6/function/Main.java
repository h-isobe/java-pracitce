//リスト6-2 メソッドを変数に代入して呼び出す例
import java.util.function.*;  //いくつかAPIとしてSAMインターフェースが用意されている

public class Main {
  public static int sub(int a, int b) {
    return a - b;
  }
  public static void main(String[] args) {
    //subメソッドの処理ロジックを、変数funcに代入する
    IntBinaryOperator func = Main::sub;  //ここで代入して
    //変数funcに格納されている処理ロジックを、引数5と3で実行する
    int a = func.applyAsInt(5, 3);       //ここで呼び出している
    System.out.println("5-3は" + a);
  }
}