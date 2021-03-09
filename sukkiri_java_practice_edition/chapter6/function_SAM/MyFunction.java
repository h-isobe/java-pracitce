//リスト6-3 関数格納用のインターフェースを宣言して利用する
//MyFunction型を使えるようにするために
//SAMインターフェースを定義する
public interface MyFunction {
  public abstract int call(int x, int y);  //格納したい関数(sub)と同じ、引数はintが2つ、戻り値はintの抽象メソッドを準備
}

//インターフェース名やメソッド名は自由に決めていい