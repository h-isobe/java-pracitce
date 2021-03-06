//リスト3-4と3-5
import java.util.HashSet;  //重複不可、順序関係なし配列
import java.util.Set;    

public class Main {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();  //あいまいな型のSetインターフェイスに格納
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤");  //重複して「赤」を格納しようとしても無視される
    System.out.println("色は" + colors.size() + "種類");  //=> 色は3種類

    for(String s : colors) {
      System.out.print(s + "→");  //=> 青→赤→黄 (格納の順序と異なる)
    }
  }
}