//リスト3-2 イテレータの取得
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();  //イテレータの取得。インスタンスを生成する場合newを使わない。メソッド。
    //iterator()メソッドを呼び出すとリスト配列の先頭(最初の箱)より前を指した状態の矢印を取得する。
    //取得したイテレータに対して使えるメソッドは主にhasNext()とnext()の2つ。
  }
}