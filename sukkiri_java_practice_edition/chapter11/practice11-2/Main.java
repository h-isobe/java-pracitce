//練習問題11-2
import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Socket sock = new Socket("smtp.example.com", 60025);
    OutpurStream os = sock.getOutputStream();
    os.write("HERO example.com¥r¥n".getBytes());
    //上のwriteと同じように他の情報も書き込む
    os.flush();
    sock.close();
  }
}