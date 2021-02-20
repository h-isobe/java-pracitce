//コード17-3 ザックリと例外を補足する
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("date.txt");
      fw.write("hello!");
      fw.close();  //ここは問題（後片付け処理が必要。必ず実行する必要がある処理。）
    } catch(Exception e) {  //Exceptionの子孫をどれでもキャッチ(抽象的に)
      System.out.println("何らかの例外が発生しました。");
    }
  }
}