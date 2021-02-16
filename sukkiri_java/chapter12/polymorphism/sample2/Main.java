//コード12-5 MonsterとSlimeの逃げ方を調べる
public class Main {
  public static void main(String[] args) {
    Slime s = new Slime();
    Monster m = new Slime();

    s.run();  //スライムはサササっと逃げ出した。
    m.run();  //スライムはサササっと逃げ出した。

    /*
    メソッドを呼び出せた場合に動く処理は、この場合、
    変数sと変数mとは箱(型)に違いはあるものの、中身はどちらもあくまでスライム。
    メソッドが実行できれば、当然スライムが逃げる動作になる。
    実際に動くメソッドの中身はインスタンの型(中身の型)によって決まる。
    */
  }
}