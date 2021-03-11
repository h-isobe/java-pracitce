//リスト11-1 URLを用いた高水準API
import java.io.*;
import java.net.*;

public class Main {
  //例外処理は省略して記述
  public static void main(String[] args) throws IOException {
    URL url = new URL("http://dokojava.jp");
    InputStream is = url.openStream();  //バイト列
    InputStreamReader isr = new InputStreamReader(is);  //文字ストリームとして取得
    int i = isr.read();  //ストリームから1バイトずつ情報を取り出す
    while(i != -1) {
      System.out.print((char) i);
      i = isr.read();
    }
    isr.close();
  }
}