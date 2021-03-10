//リスト10-5
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Writer fw = new FileWriter("c:¥¥rpgsave.properties");
    Properties p = new Properties();
    p.setProperty("heroNam", "アサカ");  //データのセット
    p.setProperty("heroHp", "62");
    p.setProperty("heroMp", "45");
    p.store(fw, "勇者の情報");  //ファイルへ書き出す。ファイルの先頭にコメントとして出力される
    fw.close();
  }
}

//store()を呼び出すことで初めて保存される