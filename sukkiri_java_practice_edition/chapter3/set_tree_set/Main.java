//リスト3-6 TreeSetで順序付けで整列
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {[
    Set<String> words = new TreeSet<String>();  //TreeSetクラスのインスタンス作成で自然順序付けで取り出せる
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for(String s : words) {
      System.out.println(s + "→");  //=> cat→dog→panda→wolf→
    }
  ]}
}