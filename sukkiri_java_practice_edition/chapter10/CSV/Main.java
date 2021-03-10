//リスト10-3 StringTokenizerを使った文字列の分割
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String s = "ミナト,アサカ,スガワラ";
    StringTokenizer st = new StringTokenizer(s, ",");  //カンマをデリミタ指定(カンマで区切る)
    while(st.hasMoreTokens()) {  //次のトークンがあるか検査
      String t = st.nextToken(); //次のトークンの取得
      System.out.println(t);
    }
  }
}