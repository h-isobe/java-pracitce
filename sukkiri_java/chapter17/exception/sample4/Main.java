//コード17-10 try-with-resources文の利用
import java.io.*;

public class Main {
  public static void main(String[] args) {
    //try-catch文を抜ける際に、自動的にclose()が呼び出されるので、finallyブロックの記述は不要
    try (FileWriter fw = new FileWriter("date.txt");) {  //tryの後に、closeによる後片付けが必要な変数の宣言
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("何らかの例外が発生しました");
    }
  }
}