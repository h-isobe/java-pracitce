//コード15-7 splitメソッドを使った文字列の分割
public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ght";
    String[] words = s.split(",:");
    for (String w : words) {
      System.out.println(w + "->");  //=> abc->def->ghi->
    }
  }
}