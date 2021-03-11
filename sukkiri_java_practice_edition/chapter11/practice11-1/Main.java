//練習問題11-1
import java.net.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://dokojava.jp/favicon.ico");
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream("dj.ico");
    int i = is.read();
    while(i != -1) {
      os.write((byte) i);
      i = is.read();  //ネットワークから読み込んでファイルに書き出す
    }
    is.close();
    os.flush();
    os.close();
  }
}