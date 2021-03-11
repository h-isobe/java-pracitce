//リスト11-2 Socketを用いてhttp://dokojava.jp/index.htmlを取得する
import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Socket sock = new Socket("dokojava.jp", 80);          //①IPアドレスまたはサーバー名とポート番号を指定してインスタンス生成
    InputStream is = sock.getInputStream();               //②入力ストリームと出力ストリームを取得
    OutputStream os = sock.getOutputStream();
    os.write("GET /index.html HTTP/1.0¥r¥n".getBytes());  //③HTTP要求を送信
    os.write("¥r¥n".getBytes());
    os.flush();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();                                   //③応答を受信
    while(i != -1) {
      System.out.print((char) i);
      i = isr.read();
    }
    sock.close();                                         //④ソケットを閉じる
  }
}