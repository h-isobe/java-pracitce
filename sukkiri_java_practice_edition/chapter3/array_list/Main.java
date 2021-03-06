//リスト3-1 コレクションにできないこと(int型)
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<integer> points = new ArrayList<integer>();  //Integer型でArrayListを宣言
    points.add(10);  //自動的にIntegerに変換・格納される
    points.add(80);
    points.add(75);
    for(int i : points) {
      System.out.println(i);
    }
  }
}