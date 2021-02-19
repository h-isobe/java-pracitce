//コード16-1 ラッパークラスをArrayListに格納する
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();  //Integer型でArrayListを宣言
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      System.out.println(i);
    }
  }
}