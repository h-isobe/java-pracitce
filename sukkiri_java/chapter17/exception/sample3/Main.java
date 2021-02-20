//コード17-5 finallyブロックでcloseすると。。。(エラー)
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("date.txt");  //変数のスコープ
      fw.write("hello!");
    } catch(Exception e) {
      System.out.println("何らかの例外が発生しました");
    } finally {
      fw.close();  //この行でエラーがでる(エラー：シンボルが見つけられません) => 変数fwにアクセスできない
    }
  }
}