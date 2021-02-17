//コード14-3 どんなインスタンスでも受け取れるメソッド
public class Main {
  public void printAnything(Object o) {
    //何型でもいいから、引数を1つ受け取り画面に表示
    System.out.println(o.toString());

    //toString()は自分自身の内容の文字列表現を返す
  }
}