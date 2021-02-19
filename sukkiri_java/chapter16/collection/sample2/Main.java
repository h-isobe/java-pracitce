//コード16-2 イテレータを使ったArrayListの繰り返し処理
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();  
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator(); //イテレータの取得(インスタンスを生み出す)
    while (it.hasNext()) {   //イテレータの矢印を次に進められるなら繰り返す
      String e = it.next();  //矢印を次に進め、内容を取り出す
      System.out.println(e);
    }
  }
}