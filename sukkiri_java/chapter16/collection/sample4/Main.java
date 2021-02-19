//コード16-5 TreeSetから文字列を取り出すと。。。
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>();  //自然順序付でStringクラスは辞書順に
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.print(s + "->");
    }
  }
}