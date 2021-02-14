//インターフェイスとして特別扱いできる条件
//①全てのメソッドは抽象メソッド
//②基本的にフィールドを1つも持たない
//public static finalがついたフィールド(定数)だけは宣言可能
public interface Creature {
  void run();  //public abstract を省略しても大丈夫
}