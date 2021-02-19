//コード15-8 replaceAllメソッドを使った文字列の置換
public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh", "X");
    System.out.println(w);  //=> aXc,dXf,gXi

    //最初の1つだけを置換するreplaceFirst()メソッドもある
  }
}