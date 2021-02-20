//コード17-2 try-catch分でException系例外の発生に備える
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("date.txt");    //通常実行される文
    } catch(IOException e) {
      System.out.println("エラーが発生しました。");  //例外発生時に実行される文
    }
  }
}